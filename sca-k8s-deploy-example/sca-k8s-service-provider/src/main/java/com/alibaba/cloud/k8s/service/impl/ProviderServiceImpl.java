package com.alibaba.cloud.k8s.service.impl;

import com.alibaba.cloud.k8s.service.ProviderService;
import org.springframework.stereotype.Service;

import java.io.Serial;

/**
 * @author yuluo
 * @author 1481556636@qq.com
 */

@Service
public class ProviderServiceImpl implements ProviderService {

	@Override
	public String providerA() {

		return "This response from provider A!";
	}

	@Override
	public String providerB() {

		return "This response from provider B!";
	}
}
