package com.anilt.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulServerGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerGatewayApplication.class, args);
	}

}
