package com.zq.springcloud.alibaba.dao;

import com.zq.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/3118:57
 * @Company: MGL
 */
@Mapper
public interface OrderDao{

    //新建订单
    void create(Order order);

    //修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}