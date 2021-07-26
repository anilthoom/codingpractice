package com.anilt.rest.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.http.HttpHeaders;

@SpringBootApplication
public class RestTemplateApplication {

	public static String baseUrl = "http://localhost:8080/products/";
	public static void main(String[] args) {
		SpringApplication.run(RestTemplateApplication.class, args);
	}
}
