package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer4configApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer4configApplication.class, args);
	}
}
