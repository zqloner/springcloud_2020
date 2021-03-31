package com.zq.springcloud.alibaba.service.impl;

import com.zq.springcloud.alibaba.service.PaymentService;
import com.zq.springcloud.entities.CommonResult;
import com.zq.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/3110:35
 * @Company: MGL
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id)   {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
