package com.zq.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/4/119:07
 * @Company: MGL
 */
@Configuration
@MapperScan({"com.zq.springcloud.dao"})
public class MyBatisConfig {
}
