package com.anilt.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FileUploadDownloadDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadDownloadDbApplication.class, args);
	}

}
