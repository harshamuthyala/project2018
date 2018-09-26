package com.microservice.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microservice.entity.User;

@Component
public class DatabaseService {

	@Autowired
	DatabaseRepository userRepository;
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public String authenticateUser(User user) {
		User userData=userRepository.findByUserName(user.getUserName());
		if(userData!=null && user.getUserName()!=null && user.getPassword()!=null
				&& user.getUserName().equals(userData.getUserName())
				&& user.getPassword().equals(userData.getPassword())) {
			return "success";
		}else {
			return "failure";
		}
	}
	
	public User registerUser(User user) {
		User userData=userRepository.save(user);
		if(userData!=null) {
			return userData;
		}else {
			return new User();
		}
	}

}
