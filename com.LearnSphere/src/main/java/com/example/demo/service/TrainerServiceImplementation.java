package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Course;
import com.example.demo.entity.Lesson;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.LessonRepository;
@Service
public class TrainerServiceImplementation implements TrainerService {
	@Autowired
	CourseRepository crepo;
	@Autowired
	LessonRepository lrepo;

	@Override
	public String addCourse(Course c) {
		crepo.save(c);
		return "course added successfully";
	}

	@Override
	public Course getCourse( int courseId) {
		
		try {
		     crepo.findById(courseId).get();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return crepo.findById(courseId).get();
	}

	@Override
	public String addLesson(Lesson lesson) {
		lrepo.save(lesson);
		return "Lesson added successfully";
	}

	@Override
	public List<Course> courseList() {
		  
		return crepo.findAll();
	}

}
