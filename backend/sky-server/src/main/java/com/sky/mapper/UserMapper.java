package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * 用户数据访问层
 */
@Mapper
public interface UserMapper {

    /**
     * 根据openid查询用户
     *
     * @param openid 微信用户的唯一标识
     * @return 查询到的用户对象，如果不存在则返回null
     */
    @Select("select * from user where openid = #{openid}")
    User getByOpenid(@Param("openid") String openid);

    /**
     * 插入用户数据
     *
     * @param user 要插入的用户对象
     */
    void insert(User user);

    /**
     * 根据动态条件统计用户数量
     * @param map
     * @return
     */
    Integer countByMap(Map map);
}
