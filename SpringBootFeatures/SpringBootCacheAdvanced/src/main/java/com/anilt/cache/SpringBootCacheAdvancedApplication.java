package com.anilt.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootCacheAdvancedApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootCacheAdvancedApplication.class, args);
		System.out.println(test("contributor", null));
	}

	public static String test(String type, String template){
		if ((type.equalsIgnoreCase("contributor") && template == null)
				|| (type.equalsIgnoreCase("reviewer") && template == null)
				|| (type.equalsIgnoreCase("rejection") && template == null)
				|| (type.equalsIgnoreCase("approval") && template == null)
				|| (type.equalsIgnoreCase("review-participant") && template == null)
				|| (type.equalsIgnoreCase("active") && template == null)) {
			return null;
		}
		return "OK!!!";
	}
}
