package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {

	@GetMapping("/index")
	public String index()
	{
		return "index";
	}
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	@GetMapping("/cCourse")
	public String createCourse()
	{
		return "createCourse";
	}
	@GetMapping("/aLesson")
	public String addLesson()
	{
		return "addLesson";
	}
	@GetMapping("/thome")
	public String trainerHome()
	{
		return "trainerhome";
	}
	@GetMapping("/shome")
	public String studentHome()
	{
		return "studenthome";
	}
	@GetMapping("/courses")
	public String courses()
	{
		return "courses";
	}
	
	@GetMapping("/myCourses")
	public String myCourses()
	{
		return "myCourses";
	}
	
	@GetMapping("/purchase")
	public String purchase()
	{
		return "courses";
	}
	
	@GetMapping("/getlesson")
	public String getLesson()
	{
		return "demoLesson";
	}
	
	@GetMapping("/buy")
	public String buy()
	{
		return "buy";
	}


	
	
}
