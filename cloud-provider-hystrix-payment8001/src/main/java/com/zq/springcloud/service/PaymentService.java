package com.zq.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/1914:18
 * @Company: MGL
 */
@Service
public class PaymentService {
    //成功
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_OK,id：  "+id+"\t"+"哈哈哈"  ;
    }

    //失败
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name ="execution.isolation.thread.timeoutInMilliseconds",value = "5000")  //5秒钟以内就是正常的业务逻辑
    })
    public String paymentInfo_TimeOut(Integer id){
//        int timeNumber = 5; //休眠五秒
//          int age = 10 / 0;  //创造异常
        try { TimeUnit.MILLISECONDS.sleep(3000); }catch (Exception e) {e.printStackTrace();}
//        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id：  "+id+"\t"+"O(∩_∩)O哈哈~"+" 耗时(秒)"+timeNumber;
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id：  "+id+"\t"+"O(∩_∩)O哈哈~"+" 耗时(秒)";
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   当前系统繁忙,请您稍后再试,id：  "+id+"\t"+"o(╥﹏╥)o";
    }
}