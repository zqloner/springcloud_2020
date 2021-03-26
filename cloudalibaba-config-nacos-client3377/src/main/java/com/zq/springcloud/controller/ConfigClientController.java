package com.zq.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/2617:34
 * @Company: MGL
 */
@RestController
@RefreshScope  //通过springcloud原生注解 @RefreshScope 实现配置自动更新
public class ConfigClientController{

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }
}