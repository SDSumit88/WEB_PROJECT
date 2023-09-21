package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Comments;
import com.example.demo.entity.Users;
import com.example.demo.service.CommentService;
import com.example.demo.service.UserService;

@Controller
public class ServiceController {
	@Autowired
	UserService us;
	@Autowired
	CommentService cService;
	
  
	@PostMapping("/addUser")
	public String addUser(@RequestParam("fisrt name") String first_name,@RequestParam("last name") String last_name,@RequestParam("Email") String email,@RequestParam("password") String password,@RequestParam("number") String Mobile,@RequestParam("role") String Role)
	{
		 boolean emailExits=us.checkEmail(email);
		 if(emailExits==false) {
		Users user = new Users();
		user.setFirst_name(first_name);
		user.setLast_name(last_name);
		user.setEmail(email);
		user.setPassword(password);
		user.setMobile(Mobile);
		user.setRole(Role);
		us.addUser(user);
		System.out.println("user registered successfully");
		System.out.println(Role);
		
		return "/login";
	}
		 else
		 {
			 System.out.println("user already exits....");
			 return "/register";
		 }
		 
 

}
	   @PostMapping("/validate")
	   public String validate(@RequestParam("Email")String email,@RequestParam("password")String password)
	   {
		    
		    
		       boolean val= us.validate(email, password);
		       if(val==true)
		       {
		    	  if(us.getUserRole(email).equals("trainer"))
		    	  {
		    	   return "trainerhome";
		       }
		       else
		       {
		    	 
		    	   return "studenthome";
		       }
		    }
		       else
		       {
		    	   System.out.println("incorrect credential ,please try again later");
		    	   return "login";
		       }
		 
	   }
	   
	   @PostMapping("/addComment")
	   public String comments(@RequestParam("comment")String comment, Model model)
	   {
		           Comments  c= new Comments();  
		           c.setComment(comment);
		           //for adding comment to database
		           cService.addComment(c);
		           
		           //for fetching comments from database to front end
		           
		          List<Comments> commentList=cService.commentList();
		          model.addAttribute("comment", commentList);
		          return "/index";
		          
	   }
	   
}


