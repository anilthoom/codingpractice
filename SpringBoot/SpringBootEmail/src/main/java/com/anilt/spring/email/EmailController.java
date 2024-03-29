package com.anilt.spring.email;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	//@Async("asyncExecutor")
	public void sendMail(@RequestBody EmailDetails emailDetails) {

		
		  //Create mail sender JavaMailSenderImpl mailSender = new
		  JavaMailSenderImpl mailSender = new JavaMailSenderImpl();   
		  mailSender.setHost(this.emailConfig.getHost());
		  mailSender.setPort(this.emailConfig.getPort());
		  //mailSender.setUsername(this.emailConfig.getUsername());
		  //mailSender.setPassword(this.emailConfig.getPassword());
		  
		  //Create an email message SimpleMailMessage mailMessage = new
		  SimpleMailMessage mailMessage = new SimpleMailMessage(); 
		  mailMessage.setFrom(emailDetails.getEmail());
		  mailMessage.setTo("anilt@opentext.com");
		  mailMessage.setSubject("License Renewal Notification");
		  mailMessage.setText(emailDetails.getEmailContent());
		  
		  //Send mail 
		  mailSender.send(mailMessage);
		  

	}
}
