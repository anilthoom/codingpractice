package com.anilt.spring.security.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anilt.spring.security.student.Student;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

	private static final List<Student> STUDENTS = Arrays.asList(
			new Student(1,"Anil"),
			new Student(2, "Ramya"),
			new Student(3, "Shrihan Chandra"),
			new Student(4, "Shri Tharunika")
	);
	
	@GetMapping("{studentId}")
	public Student getStudent(@PathVariable("studentId") Integer studentId) {
		return STUDENTS.stream().filter(student -> studentId.equals(student.getStudentId()))
		.findFirst()
		.orElseThrow(() -> new IllegalStateException("Student "+studentId + " does not exists in the repository."));
	}
}
