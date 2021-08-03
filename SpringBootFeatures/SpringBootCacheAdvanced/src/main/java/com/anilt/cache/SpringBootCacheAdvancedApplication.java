package com.anilt.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootCacheAdvancedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCacheAdvancedApplication.class, args);
	}

}
