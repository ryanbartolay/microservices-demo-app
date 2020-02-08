package com.example.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootMicroservicesCommonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservicesCommonServiceApplication.class, args);
	}

}
