package com.sky.service.impl;

import com.sky.context.BaseContext;
import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.Dish;
import com.sky.entity.Setmeal;
import com.sky.entity.ShoppingCart;
import com.sky.exception.BusinessException;
import com.sky.mapper.DishFlavorMapper;
import com.sky.mapper.DishMapper;
import com.sky.mapper.SetmealMapper;
import com.sky.mapper.ShoppingCartMapper;
import com.sky.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;
    @Autowired
    private DishMapper dishMapper;
    @Autowired
    private DishFlavorMapper dishFlavorMapper;
    @Autowired
    private SetmealMapper setmealMapper;

    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    public void addShoppingcart(ShoppingCartDTO shoppingCartDTO) {
        ShoppingCart shoppingCart = new ShoppingCart();
        BeanUtils.copyProperties(shoppingCartDTO,shoppingCart);
        Long userId = BaseContext.getCurrentId();
        shoppingCart.setUserId(userId);
        List<ShoppingCart> list = shoppingCartMapper.list(shoppingCart);

        if(list != null && list.size() > 0){
            ShoppingCart cart = list.get(0);
            cart.setNumber(cart.getNumber() + 1);
            shoppingCartMapper.updateNumberById(cart);
        }else{
            Long dishId = shoppingCartDTO.getDishId();
            if(dishId != null){
                Dish dish = dishMapper.getById(dishId);
                shoppingCart.setName(dish.getName());
                shoppingCart.setImage(dish.getImage());
                shoppingCart.setAmount(dish.getPrice());
            }else{
                Long setmealId = shoppingCartDTO.getSetmealId();
                Setmeal setmeal = setmealMapper.getSetmealId(setmealId);
                shoppingCart.setName(setmeal.getName());
                shoppingCart.setImage(setmeal.getImage());
                shoppingCart.setAmount(setmeal.getPrice());
            }
            shoppingCart.setNumber(1);
            shoppingCart.setCreateTime(LocalDateTime.now());
            shoppingCartMapper.insert(shoppingCart);
        }
    }
    public List<ShoppingCart> listShoppingCart() {
        return shoppingCartMapper.listShoppingCart(BaseContext.getCurrentId());
    }

    /**
     * 清空购物车
     */
    public void cleanShoppingCart() {
        shoppingCartMapper.deleteByUserId(BaseContext.getCurrentId());
    }


    /**
     * 根据用户ID和购物车DTO获取购物车商品项
     * @param userId 用户ID
     * @param shoppingCartDTO 购物车DTO
     * @return 购物车商品项
     */
    private ShoppingCart getShoppingCartItem(Long userId, ShoppingCartDTO shoppingCartDTO) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setUserId(userId);
        shoppingCart.setDishId(shoppingCartDTO.getDishId());
        shoppingCart.setSetmealId(shoppingCartDTO.getSetmealId());
        shoppingCart.setDishFlavor(shoppingCartDTO.getDishFlavor());
        
        List<ShoppingCart> list = shoppingCartMapper.list(shoppingCart);
        if (list != null && list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    /**
     * 删除一个商品
     */
    public boolean subShoppingCart(ShoppingCartDTO shoppingCartDTO) {
        Long currentId = BaseContext.getCurrentId();
        ShoppingCart cartItem = getShoppingCartItem(currentId, shoppingCartDTO);
        if (cartItem == null) {
            // 购物车没有找到对应的商品数据
            if (shoppingCartDTO.getDishId() != null) {
                throw new BusinessException("没有找到对应的菜品ID：" + shoppingCartDTO.getDishId());
            }
            throw new BusinessException("没有找到对应的套餐ID：" + shoppingCartDTO.getSetmealId());
        }
        Integer number = cartItem.getNumber();
        int affectRow;
        if (number == 1) {
            // 如果只剩下1个，那么直接删除对应的购物车数据
            affectRow = shoppingCartMapper.deleteCartItem(cartItem.getId());
        }else {
            // 更新商品数量
            cartItem.setNumber(cartItem.getNumber() - 1);
            affectRow = shoppingCartMapper.updateCartItem(cartItem);
        }
        return affectRow > 0;
    }

}
