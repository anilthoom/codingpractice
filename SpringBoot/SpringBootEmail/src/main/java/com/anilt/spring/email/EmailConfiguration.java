package com.anilt.spring.email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class EmailConfiguration {

	@Value("${spring.mail.host}")
	private String host;
	
	@Value("${spring.mail.port}")
	private int port;
	
	/*
	 * @Value("${spring.mail.username}") private String username;
	 * 
	 * @Value("${spring.mail.password}") private String password;
	 */
}
