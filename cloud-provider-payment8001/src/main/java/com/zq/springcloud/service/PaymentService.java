package com.zq.springcloud.service;


import com.zq.springcloud.entities.Payment;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/1/2716:38
 * @Company: MGL
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
