package com.sky.vo;

import com.sky.entity.OrderDetail;
import com.sky.entity.Orders;
import java.io.Serializable;
import java.util.List;

public class OrderVO extends Orders implements Serializable {

    private String orderDishes;
    private List<OrderDetail> orderDetailList;

    public OrderVO() {
    }

    public OrderVO(String orderDishes, List<OrderDetail> orderDetailList) {
        this.orderDishes = orderDishes;
        this.orderDetailList = orderDetailList;
    }

    public OrderVO(Long id, String number, Integer status, Long userId, Long addressBookId, java.time.LocalDateTime orderTime, java.time.LocalDateTime checkoutTime, Integer payMethod, Integer payStatus, java.math.BigDecimal amount, String remark, String userName, String phone, String address, String consignee, String cancelReason, String rejectionReason, java.time.LocalDateTime cancelTime, java.time.LocalDateTime estimatedDeliveryTime, Integer deliveryStatus, java.time.LocalDateTime deliveryTime, int packAmount, int tablewareNumber, Integer tablewareStatus, String orderDishes, List<OrderDetail> orderDetailList) {
        super(id, number, status, userId, addressBookId, orderTime, checkoutTime, payMethod, payStatus, amount, remark, userName, phone, address, consignee, cancelReason, rejectionReason, cancelTime, estimatedDeliveryTime, deliveryStatus, deliveryTime, packAmount, tablewareNumber, tablewareStatus);
        this.orderDishes = orderDishes;
        this.orderDetailList = orderDetailList;
    }

    public String getOrderDishes() {
        return orderDishes;
    }

    public void setOrderDishes(String orderDishes) {
        this.orderDishes = orderDishes;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}
