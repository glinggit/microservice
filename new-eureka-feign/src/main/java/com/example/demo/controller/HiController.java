package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Ifeign.SchedualServiceHi;

@RestController
public class HiController {
	@Autowired
	SchedualServiceHi schedualServiceHi;

	@RequestMapping(value = "/hi")
	public String sayHi(@RequestParam String name) {
		System.out.println("feign comming");
		return schedualServiceHi.sayHiFromClientOne(name);
	}
}
