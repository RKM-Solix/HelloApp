package com.solix.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAppApplication.class, args);
		
		System.out.println(sayWelcome());
	}

	public static String sayWelcome() {
		return "Hello, Welcome to SpringBoot!!!";
	}
}
