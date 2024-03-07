package com.alibaba.cloud.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yuluo
 * @author 1481556636@qq.com
 */

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
@LoadBalancerClients({
		@LoadBalancerClient("sca-k8s-provider")
})
public class SCAK8sConsumerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SCAK8sConsumerApplication.class, args);
	}

}
