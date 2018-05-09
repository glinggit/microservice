package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@SpringBootApplication
@EnableDiscoveryClient
public class NewEurekaRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewEurekaRibbonApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public IRule ribbonRule() {
		// 这里配置策略，和配置文件对应
		return new RandomRule();
	}
}
