package com.kodbook.services;
import com.kodbook.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.kodbook.repositories.UserRepository;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class UserServiceImplementation implements UserService {

	@Autowired
	UserRepository repo;

	@Override
	public User addUser(String username, String password, String email, String gender, String dob) {

		User u=new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setEmail(email);
		u.setGender(gender);
		u.setDob(dob);
	
		return repo.save(u);
	}

	@Override
	public boolean validateUser(String email) {
		
		   
	        return repo.existsByEmail(email);
	}

	@Override
	public User validation(String email) {
		
		return repo.findByEmail(email);
	}

	
	
}
