package com.anilt.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sdeploymentdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(K8sdeploymentdemoApplication.class, args);
	}
	@RequestMapping("/msg")
	public String getMessge() {
		return "K8s Deployment Demo";
	}

}
