package com.springbootdemo.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.springbootdemo.model.Student;
import com.springbootdemo.springbootdemo.service.StudentServiceI;

@RestController
public class StudentController {

	@Autowired
	private StudentServiceI studentService;
	
	
	@RequestMapping("/student")
	public List<Student> getList() {
		return studentService.findAll();
	}
	
}
