package com.zq.springcloud.domain;

import lombok.Data;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/3120:46
 * @Company: MGL
 */
@Data
public class Storage {

    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;

    //已用库存
    private Integer used;

    //剩余库存
    private Integer residue;
}