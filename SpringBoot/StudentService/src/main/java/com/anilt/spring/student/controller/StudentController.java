package com.anilt.spring.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/school")
public class StudentController {
	
	@GetMapping("/name")
	public String getSchoolName() {
		return "SVIS - Sri Vidyranya International School.";
	}
}
