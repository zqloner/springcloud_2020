package com.zq.springcloud.alibaba.service;

import com.zq.springcloud.alibaba.service.impl.PaymentFallbackService;
import com.zq.springcloud.entities.CommonResult;
import com.zq.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/3110:33
 * @Company: MGL
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService{

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);

}
