package com.catalyst.libraryproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.catalyst.*")
public class LibraryprojApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/librarymgt");
		SpringApplication.run(LibraryprojApplication.class, args);
	}

}
