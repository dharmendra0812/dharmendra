package com.springbootdemo.springbootdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootdemo.springbootdemo.model.Student;
import com.springbootdemo.springbootdemo.repository.StudentRepository;

@Service 
public class StudentServiceImpl implements StudentServiceI{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		return  (List<Student>) studentRepository.findAll();
	}
	

}
