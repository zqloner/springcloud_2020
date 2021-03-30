package com.zq.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zq.springcloud.entities.CommonResult;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/3019:53
 * @Company: MGL
 */
public class CustomerBlockHandler {

    public static CommonResult handleExceptionMethod1(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler....handleExceptionMethod1");
    }

    public static CommonResult handleExceptionMethod2(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler....handleExceptionMethod2");
    }

    public static CommonResult handleExceptionMethod3(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler....handleExceptionMethod3");
    }

}