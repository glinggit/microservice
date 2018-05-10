package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class NewEurekaZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewEurekaZipkinApplication.class, args);
	}
}
