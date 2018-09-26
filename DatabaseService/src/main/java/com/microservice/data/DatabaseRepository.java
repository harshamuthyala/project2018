package com.microservice.data;

import org.springframework.data.repository.CrudRepository;

import com.microservice.entity.User;


public interface DatabaseRepository extends CrudRepository<User, Long>{
	
	public User findByUserName(String userName);

}
