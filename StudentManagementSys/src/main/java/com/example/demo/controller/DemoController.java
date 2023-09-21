package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;


@Controller
public class DemoController {

	StudentService ss;
	
	public DemoController(StudentService ss)
	{
		this.ss=ss;
	}
	

	@GetMapping("/viewI")
	public String mapViewInfo()
	{
		return "viewInfo";
	}
	
	@GetMapping("/showI")
	public String mapShowInfo()
	{
		return "showInfo";
	}
	
	@GetMapping("/add")
	public String addS()
	{
		return "addStudent";
	} 
	
	@PostMapping("/add stud")
     public String addStudent(@RequestParam("kodId") String kodId,@RequestParam("name") String name,@RequestParam("branch") String branch)
     
     {
    	 Student s = new Student(kodId,name,branch);
    	   ss.addStudent(s);
    	   return "index";
     }
	
	 @GetMapping("/getStud")
	 public String getStudent(@RequestParam("kodId") String kodId,Model model)
	 {
		      Student  s=ss.getStudent(kodId);
		      model.addAttribute("Student",s);
		      return "showInfo";
	 }
	 
	 @GetMapping("/upd")
		public String updS()
		{
			return "updateStudent";
		}
	 @PutMapping("/upd stud")
	 public String updateStudent(@RequestParam("kodId")String kodId,@RequestParam("name")String name,@RequestParam("branch")String branch )
	 {
		                     Student st=ss.getStudent(kodId);
		                     st.setName(name);
		                     st.setBranch(branch);
		                     ss.updateStudent(st);
		                     return "index";
	 }
}
