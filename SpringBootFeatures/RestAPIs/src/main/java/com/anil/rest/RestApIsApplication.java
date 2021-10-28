package com.anil.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class RestApIsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApIsApplication.class, args);
	}

}
