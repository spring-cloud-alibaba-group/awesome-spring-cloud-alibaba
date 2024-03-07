package com.alibaba.cloud.k8s.config;

import com.alibaba.cloud.k8s.feign.K8sFeignCallback;
import org.springframework.context.annotation.Bean;

/**
 * @author yuluo
 * @author 1481556636@qq.com
 */

public class K8sFeignConfig {

    @Bean
    public K8sFeignCallback feignCallback() {

        return new K8sFeignCallback();
    }

}
