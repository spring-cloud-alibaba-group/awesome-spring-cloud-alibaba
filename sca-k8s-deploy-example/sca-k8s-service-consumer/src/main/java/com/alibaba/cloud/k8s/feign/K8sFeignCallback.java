package com.alibaba.cloud.k8s.feign;

/**
 * @author yuluo
 * @author 1481556636@qq.com
 */

public class K8sFeignCallback implements K8sFeignClient{

    @Override
    public String providerA() {

        return "call provider A interface failed, fallback";
    }

    @Override
    public String providerB() {

        return "call provider B interface failed, fallback";
    }
}
