package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired  
    private LoadBalancerClient loadBalancerClient;  

	public String hiService(String name) {
		this.loadBalancerClient.choose("service-hi");//随机访问策略
		return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
	}
}
