package com.zq.springcloud.service.impl;

import com.zq.springcloud.entities.Payment;
import com.zq.springcloud.dao.PaymentDao;
import com.zq.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/1/2716:38
 * @Company: MGL
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
