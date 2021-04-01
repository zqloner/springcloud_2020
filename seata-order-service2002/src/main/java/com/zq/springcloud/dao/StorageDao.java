package com.zq.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/4/118:30
 * @Company: MGL
 */
@Mapper
public interface StorageDao {

    //扣减库存信息
    void decrease(@Param("productId") Long productId, @Param("count") Long count);

}