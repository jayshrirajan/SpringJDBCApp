package com.example.simplejdbcapp.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	
	// we are autowiring the jdbc template using the properties we have configured in application.properties
	//automatically detects and created jdbc template object using the configuration.
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<String> getAllUserNames() {
		List<String> usernameList = new ArrayList<>();
		usernameList.addAll(jdbcTemplate.queryForList("select name from user;", String.class));
		
		return usernameList;
	}

}
