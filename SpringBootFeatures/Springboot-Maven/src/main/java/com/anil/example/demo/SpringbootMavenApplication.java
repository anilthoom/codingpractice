package com.anil.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMavenApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello Anil1";
	}
}
