package com.microservice.client.LoginService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan({"com.microservice.service","com.microservice.model","com.microservice.client.LoginService"} )
public class LoginServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(LoginServiceApplication.class, args);
	}
	
}
