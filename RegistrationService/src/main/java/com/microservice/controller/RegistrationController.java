package com.microservice.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.model.User;

@RestController
@RequestMapping("/userReg")
public class  RegistrationController{
	
	Log LOGGER=LogFactory.getLog(RegistrationController.class);
	
	private  RestTemplate restTemplate =new RestTemplate();
	
	String resourceUrl = "http://localhost:8083/dbservice/registerUser";
	
	
	@PostMapping
	@RequestMapping("/register")
	public User registerUser(@RequestBody User user) {
		
		ResponseEntity<User> response= restTemplate.postForEntity(resourceUrl,user, User.class);
		LOGGER.info("Register User");
		System.out.println("Register User");
		return response.getBody();
	}

}
