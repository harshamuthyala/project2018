package com.microservice.client.LoginService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.model.User;
import com.microservice.service.LoginService;

@RestController
@RequestMapping("/user")
public class LoginController {

	Log LOGGER=LogFactory.getLog(LoginController.class);
	
	@Autowired
	LoginService loginService;
	
	/*@Value("${world.message}")
	private String message;
	*/
	@PostMapping
	@RequestMapping("/login")
	public String login(@RequestBody User user) {
		
		String flag=loginService.loginUser(user);
		LOGGER.info("Login "+flag);
		LOGGER.info("Config ");
		return flag;
	}
	
}
