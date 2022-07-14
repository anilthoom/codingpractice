package com.anilt.k8s.deploymentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeploymentdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeploymentdemoApplication.class, args);
	}

	@RequestMapping("/message")
	public String getMessage(){
		return "K8S Demployment Demo";
	}
}
