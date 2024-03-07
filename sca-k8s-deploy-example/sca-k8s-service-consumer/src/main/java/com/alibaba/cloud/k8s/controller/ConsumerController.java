package com.alibaba.cloud.k8s.controller;

import com.alibaba.cloud.k8s.service.ConsumerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuluo
 * @author 1481556636@qq.com
 */

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

	@Autowired
	private ConsumerService consumerService;

	@GetMapping("/a")
	public String consumerA() {

		return consumerService.consumerA();
	}

	@GetMapping("/b")
	public String consumerB() {

		return consumerService.consumerB();
	}

}
