package com.zq.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Description:
 * @Author: zhangqi
 * @CreateTime: 2021/3/1810:37
 * @Company: MGL
 */
public interface LoadBalancer {
    //收集服务器总共有多少台能够提供服务的机器，并放到list里面
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
