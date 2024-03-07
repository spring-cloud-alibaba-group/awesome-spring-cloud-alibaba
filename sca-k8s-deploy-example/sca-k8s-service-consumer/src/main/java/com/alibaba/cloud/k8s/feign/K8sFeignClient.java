package com.alibaba.cloud.k8s.feign;

import com.alibaba.cloud.k8s.config.K8sFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yuluo
 * @author 1481556636@qq.com
 */

@FeignClient(
        name = "sca-k8s-provider",
        fallback = K8sFeignCallback.class,
        configuration = K8sFeignConfig.class,
        contextId = "sca-k8s-provider"
)
public interface K8sFeignClient {

    @GetMapping("/provider/a")
    String providerA();

    @GetMapping("/provider/b")
    String providerB();

}
