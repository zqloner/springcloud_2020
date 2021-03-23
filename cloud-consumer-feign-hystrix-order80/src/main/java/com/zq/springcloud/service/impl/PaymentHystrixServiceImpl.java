package com.zq.springcloud.service.impl;

import com.zq.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/2216:13
 * @Company: MGL
 */
@Component
public class PaymentHystrixServiceImpl implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
