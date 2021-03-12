package com.zq.springcloud.dao;


import com.zq.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/1/2716:27
 * @Company: MGL
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
