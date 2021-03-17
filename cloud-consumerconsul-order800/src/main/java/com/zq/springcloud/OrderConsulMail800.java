package com.zq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/1716:06
 * @Company: MGL
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMail800 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMail800.class,args);
    }
}
