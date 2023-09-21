package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import  com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;
import com.example.demo.service.TrainerService;
@Controller
public class TrainerController {
	@Autowired
	TrainerService ts;

	@PostMapping("/addCourse")
	public String addCourse(@RequestParam("course id")int courseId,@RequestParam("course name")String courseName,@RequestParam("course price") int coursePrice)
	{
		        Course c = new Course();
		        c.setCourseId(courseId);
		        c.setCourseName(courseName);
		        c.setCoursePrice(coursePrice);
		        ts.addCourse(c);
		        return "redirect:/home";
		        
	}
	@PostMapping("/lesson")
	public String lesson(@RequestParam("course id")int CourseId,@RequestParam("lesson id")int LessonId,@RequestParam("lesson name")String LessonName,@RequestParam("lesson topics")String LessonTopics,@RequestParam("link")String VideoLink)
	{
		
		 Course  c=ts.getCourse(CourseId);
		 Lesson lesson= new Lesson(LessonId, LessonName, LessonTopics, VideoLink, c);
		  ts.addLesson(lesson);
		  c.getLessons().add(lesson);
		  return "index";
		 
	}
	
	@GetMapping("/showCourses")
	public String showCourses(Model model)
	{
		 List<Course> clist=ts.courseList();
		 model.addAttribute("clist", clist);
		// System.out.println(clist);
		
		return "purchase";
	}
	
 
}
