package com.anilt.https;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HttpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpsApplication.class, args);
	}

	@RequestMapping(value = "/welcome")
	public String welcome(){
		return "Hello welcome to secured site!!!";
	}
}
