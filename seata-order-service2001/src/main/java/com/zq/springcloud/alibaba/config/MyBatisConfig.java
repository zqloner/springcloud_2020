package com.zq.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/3119:05
 * @Company: MGL
 */
@Configuration
@MapperScan({"com.zq.springcloud.alibaba.dao"})
public class MyBatisConfig {

}


