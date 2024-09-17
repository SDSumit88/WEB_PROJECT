package com.kodbook.services;

import org.springframework.stereotype.Service;

import com.kodbook.entities.User;


public interface UserService {

	public User addUser(String username,String password,String email,String gender,String dob);
	
	public boolean validateUser(String email);
	
	public User validation(String email);// on the basis of email and password
}
