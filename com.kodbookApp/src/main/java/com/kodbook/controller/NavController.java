package com.kodbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kodbook.entities.Post;
import com.kodbook.entities.User;
import com.kodbook.services.PostService;
import com.kodbook.services.UserService;

@Controller
public class NavController {
	@Autowired
	UserService us;
	@Autowired
	PostService ps;

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
	@GetMapping("/openCreatePost")
	public String createPost()
	{
		return "createPost";
	}
	
	@GetMapping("/showPosts")
	public String showPosts(Model model)
	{
		    List<Post> allPosts=ps.getAllPosts();
		    model.addAttribute("allPosts", allPosts);
		    return "showPosts";
	}
	@GetMapping("/goHome")
	public String fetchAllPosts(Model model)
	{
		List<Post> allPosts=ps.fetchAllPosts();
		model.addAttribute("allPosts", allPosts);
		return "home";
	}
	
}

	
	
