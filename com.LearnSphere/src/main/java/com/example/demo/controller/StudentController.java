package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Lesson;
import com.example.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("/goToLesson")
	public String getLesson(@RequestParam("lessonId") int lessonId,Model model)
	{
		     Lesson lesson=ss.getLesson(lessonId);
		     model.addAttribute("lesson", lesson);
		return "myLesson";
	}
}
