package com.anilt.spring.email;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sendmail")
public class EmailController {

	private EmailConfiguration emailConfig;

	public EmailController(EmailConfiguration emailConfig) {
		this.emailConfig = emailConfig;
	}
	
	@PostMapping
	public void sendMail() {
		
	}
}
