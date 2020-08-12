package com.springbootdemo.springbootdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootdemo.springbootdemo.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
