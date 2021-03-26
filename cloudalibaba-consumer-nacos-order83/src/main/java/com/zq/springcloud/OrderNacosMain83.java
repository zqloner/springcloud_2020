package com.zq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/2616:01
 * @Company: MGL
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain83
{
    public static void main(String[] args){
        SpringApplication.run(OrderNacosMain83.class,args);
    }
}
