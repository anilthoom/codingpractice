package com.anilt.spring.i18n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

	@RequestMapping("/hello")
	public String welcome()
	{
		return "hello";
	}
	
}
