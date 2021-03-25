package com.zq.springcloud.controller;

import com.zq.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/25--->22:26
 * @Company: MGL
 */
@RestController
public class SendMessageController{
    @Resource
    private IMessageProvider messageProvider;
    @GetMapping(value = "/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
