package com.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.data.DatabaseService;
import com.microservice.entity.User;

@RestController
@RequestMapping("/dbservice")
public class DatabaseController {
	
	@Autowired
	DatabaseService userService;

	@RequestMapping("/authenticate")
	@PostMapping
	public String authenticate(@RequestBody User user) {
		String flag=userService.authenticateUser(user);
		return flag;
	}
	
	@RequestMapping("/registerUser")
	@PostMapping
	public User registerUser(@RequestBody User user) {
		User flag=userService.registerUser(user);
		return flag;
	}
}
