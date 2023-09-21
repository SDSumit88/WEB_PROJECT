package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentServiceImplementation implements StudentService{
	StudentRepository srepo;
	
	public StudentServiceImplementation(StudentRepository srepo)
	{
		this.srepo=srepo;
	}
	@Override
	public String addStudent(Student s) {
		   srepo.save(s);
			return "student added";
		
	}
	@Override
	public Student getStudent(String kodId) {
		  Student s=srepo.findById(kodId).get();
		return s;
	}
	@Override
	public String updateStudent(Student s) {
		srepo.save(s);
		return "student updated";
		
	}

}
