package com.anilt.spring.emp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employer")
public class EmployeeController {
	
	@GetMapping("/name")
	public String getEmployeeName() {
		return "Employee name : Anil Kumar";
	}
}
