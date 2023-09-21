package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;

public interface TrainerService {

	public String addCourse(Course c);
	
	public Course getCourse(int courseId);
	
	public String addLesson(Lesson lesson);
	public List<Course> courseList();
}
