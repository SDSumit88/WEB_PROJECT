package com.kodbook.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kodbook.entities.User;
import com.kodbook.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService us;
	@PostMapping("/adduser")
	public String addUser(
	    @RequestParam("username") String username,
	    @RequestParam("password") String password,
	    @RequestParam("email") String email,
	    @RequestParam("gender") String gender,
	    @RequestParam("dob") String dob,
	    Model model
	) {
	    // Log the values for debugging
	    
	    // Pass the values to the service for saving
		if(us.validateUser(email))
		{
			model.addAttribute("Erorr", "Email already exists. Please use a different email.");
			return "existed";
			
		}
	    User newUser = us.addUser(username, password, email, gender, dob);
	    model.addAttribute("user", newUser);
	    return "success";
	}
	
	@PostMapping("/validate")
	public String userValidation(@RequestParam("email") String email, @RequestParam("password") String password) {
	    // Validate user existence
	    if (us.validateUser(email)) {
	        // Fetch the user
	        User u = us.validation(email);

	        // Compare passwords (use equals() without the semicolon after the if)
	        if (u.getPassword().equals(password)) {
	            return "home";  // Correct password, return success
	        } else {
	            return "register";  // Wrong password, return an appropriate view
	        }
	    } else {
	        return "register";  // User not found, redirect to registration
	    }
	}

}
