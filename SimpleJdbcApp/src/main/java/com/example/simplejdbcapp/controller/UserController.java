package com.example.simplejdbcapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simplejdbcapp.repository.UserRepository;

//make this as rest controller
@RestController
@RequestMapping(path ="/user")
public class UserController {
	
	//autowiring user repository
	@Autowired
	UserRepository userRepository;
	
	// to test our service is up and running
	@GetMapping
	public String check() {
		return "<h1>Welcome to SpringBoot JDBC Template</h1>";
	}
	
	//this method return list of usernames
	//@return usernamelist
	
	@GetMapping(path ="/getusernames")
   public List<String> getAllUserNames(){
	   return userRepository.getAllUserNames();
	   
   }
}
