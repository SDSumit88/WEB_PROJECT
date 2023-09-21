package com.example.demo.service;

import com.example.demo.entity.Users;

public interface UserService {
	//adds new user to database
	String addUser(Users u);
	//checks email is already present in database or not
	boolean checkEmail(String Email);
	
	//for validating the user while login
	public boolean validate(String email,String password);
	
	//getting user role 
	
	public String getUserRole(String email);
	
	
}
