package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
	@Autowired
	UserRepository urepo;

	@Override
	public String addUser(Users u) {
		urepo.save(u);
	
		return "user added successfully !!";
	}

	@Override
	public boolean checkEmail(String email) {
		
		return  urepo.existsByEmail(email);
		
	}

	@Override
	public boolean validate(String email, String password) {
		if( urepo.existsByEmail(email))
		{
		  Users  u= urepo.getByEmail(email);
		    String dbpassword=u.getPassword();
		    if(password.equals(dbpassword))
		    {
		    	
		    	return true;
		    }
		    else
		    {
		    	
		    	return false;
		    }
			
		}
		else
		{
		return false;
	}

	
}

	@Override
	public String getUserRole(String email) {
		       Users u=urepo.getByEmail(email);
		             
		return u.getRole();
	}
	
}
