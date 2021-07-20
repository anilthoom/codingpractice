package com.anil.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootMavenApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringbootMavenApplication.class);

	public static void main(String[] args) {
		logger.info("This is info message");
		logger.warn("Warning message!");
		logger.error("ERROR ANIL!!!");
		SpringApplication.run(SpringbootMavenApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello Anil1";
	}
}
