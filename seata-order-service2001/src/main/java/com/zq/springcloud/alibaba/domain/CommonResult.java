package com.zq.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/3118:56
 * @Company: MGL
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{

    private Integer code;

    private String  message;

    private T data;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}

