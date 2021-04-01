package com.zq.springcloud.service;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/4/118:34
 * @Company: MGL
 */
public interface StorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);
}
