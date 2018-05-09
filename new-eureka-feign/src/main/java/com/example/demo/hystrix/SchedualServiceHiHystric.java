package com.example.demo.hystrix;

import org.springframework.stereotype.Component;

import com.example.demo.Ifeign.SchedualServiceHi;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
	@Override
	public String sayHiFromClientOne(String name) {
		return "sorry " + name;
	}
}
