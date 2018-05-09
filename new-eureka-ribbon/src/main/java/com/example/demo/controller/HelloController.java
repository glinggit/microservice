package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@RestController
public class HelloController {
	@Autowired
	HelloService helloService;

	@RequestMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return helloService.hiService(name);
	}

	@Bean
	public IRule ribbonRule() {
		// 这里配置策略，和配置文件对应
		return new RandomRule();
	}
}
