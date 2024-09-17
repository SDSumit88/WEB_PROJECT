package com.kodbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kodbook.entities.User;
import com.kodbook.services.UserService;

@Controller
public class NavController {
	@Autowired
	UserService us;

	@GetMapping("/login")
	public String index()
	{
		return "index";
	}
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	@GetMapping("/opencreatePost")
	public String createPost()
	{
		return "createPost";
	}
}

	
	
