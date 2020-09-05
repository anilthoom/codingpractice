package com.anilt.spring.email;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
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
	public void sendMail(@RequestBody EmailDetails emailDetails) {
		
		/*
		 * //Create mail sender JavaMailSenderImpl mailSender = new
		 * JavaMailSenderImpl(); mailSender.setHost(this.emailConfig.getHost());
		 * mailSender.setPort(this.emailConfig.getPort());
		 * mailSender.setUsername(this.emailConfig.getUsername());
		 * mailSender.setPassword(this.emailConfig.getPassword());
		 * 
		 * //Create an email message SimpleMailMessage mailMessage = new
		 * SimpleMailMessage(); mailMessage.setFrom(emailDetails.getEmail());
		 * mailMessage.setTo("abc@gmail.com");
		 * mailMessage.setSubject("Spring email Demo from : "+ emailDetails.getEmail());
		 * mailMessage.setText(emailDetails.getEmailContent());
		 * 
		 * //Send mail mailSender.send(mailMessage);
		 */
		try {
			sendmail();
		} catch (MessagingException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void sendmail() throws AddressException, MessagingException, IOException {
		   Properties props = new Properties();
		   props.put("mail.smtp.auth", "true");
		   props.put("mail.smtp.starttls.enable", "true");
		   props.put("mail.smtp.host", "smtp.gmail.com");
		   props.put("mail.smtp.port", "587");
		   
		   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		         return new PasswordAuthentication("account@gmail.com", "<your password>");
		      }
		   });
		   Message msg = new MimeMessage(session);
		   msg.setFrom(new InternetAddress("account@gmail.com", false));

		   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("account@gmail.com"));
		   msg.setSubject("Tutorials point email");
		   msg.setContent("Tutorials point email", "text/html");
		   msg.setSentDate(new Date());

		   MimeBodyPart messageBodyPart = new MimeBodyPart();
		   messageBodyPart.setContent("Tutorials point email", "text/html");

		   Multipart multipart = new MimeMultipart();
		   multipart.addBodyPart(messageBodyPart);
		   MimeBodyPart attachPart = new MimeBodyPart();

		   attachPart.attachFile("/var/tmp/image19.png");
		   multipart.addBodyPart(attachPart);
		   msg.setContent(multipart);
		   Transport.send(msg);   
		}
}
