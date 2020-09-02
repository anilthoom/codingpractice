package com.anilt.spring.security.student.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anilt.spring.security.student.Student;

@RestController
@RequestMapping("api/v1/students")
public class StudentManagementController {
	
	private static final List<Student> STUDENTS = Arrays.asList(
			new Student(1,"Anil"),
			new Student(2, "Ramya"),
			new Student(3, "Shrihan Chandra"),
			new Student(4, "Shri Tharunika")
	);
	
	@GetMapping
	public List<Student> getAllStudents(){
		return STUDENTS;
	}

	
}
