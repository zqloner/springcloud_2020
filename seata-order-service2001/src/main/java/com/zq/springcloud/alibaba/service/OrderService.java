package com.zq.springcloud.alibaba.service;

import com.zq.springcloud.alibaba.domain.Order;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/3119:00
 * @Company: MGL
 */
public interface OrderService{
    void create(Order order);
}