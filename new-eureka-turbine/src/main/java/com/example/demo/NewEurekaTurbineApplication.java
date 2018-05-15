package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class NewEurekaTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewEurekaTurbineApplication.class, args);
	}
}
