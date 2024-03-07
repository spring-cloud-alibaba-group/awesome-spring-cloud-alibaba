package com.alibaba.cloud.k8s.service.impl;

import com.alibaba.cloud.k8s.feign.K8sFeignClient;
import com.alibaba.cloud.k8s.service.ConsumerService;
import jakarta.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yuluo
 * @author 1481556636@qq.com
 */

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Autowired
	private K8sFeignClient feignClient;

	@Override
	public String consumerA() {

		return feignClient.providerA();
	}

	@Override
	public String consumerB() {

		return feignClient.providerB();
	}
}
