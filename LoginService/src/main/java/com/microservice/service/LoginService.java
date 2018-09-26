package com.microservice.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.model.User;

@Service
public class LoginService {

    private  RestTemplate restTemplate =new RestTemplate();
	
	String resourceUrl = "http://localhost:8083/dbservice/authenticate";
	

	public String loginUser(User user) {
		
		ResponseEntity<String> response= restTemplate.postForEntity(resourceUrl,user, String.class);
		return response.getBody();
	}
}
