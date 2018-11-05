package com.eshop.services.ms.productservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProductservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductservicesApplication.class, args);
	}
}
