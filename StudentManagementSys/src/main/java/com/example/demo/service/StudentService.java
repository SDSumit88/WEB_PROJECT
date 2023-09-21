package com.example.demo.service;

import java.util.List;


import com.example.demo.entity.Student;

public interface StudentService {

      public String addStudent(Student s);
      Student getStudent(String kodId);
      String updateStudent(Student s);
}
