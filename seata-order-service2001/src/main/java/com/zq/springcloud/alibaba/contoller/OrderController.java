package com.zq.springcloud.alibaba.contoller;

import com.zq.springcloud.alibaba.domain.CommonResult;
import com.zq.springcloud.alibaba.domain.Order;
import com.zq.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/3119:04
 * @Company: MGL
 */
@RestController
public class OrderController{

    @Resource
    private OrderService orderService;
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}