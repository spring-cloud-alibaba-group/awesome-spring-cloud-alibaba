package com.alibaba.cloud.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yuluo
 * @author 1481556636@qq.com
 */

@EnableDiscoveryClient
@SpringBootApplication
public class SCAK8sProviderApplication {

	public static void main(String[] args) {

		SpringApplication.run(SCAK8sProviderApplication.class, args);
	}

}
