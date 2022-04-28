package com.zee.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComZeeDemoApplication {

	public static void main(String[] args) {

		System.out.println("Start");

		SpringApplication.run(ComZeeDemoApplication.class, args);

		System.out.println("End");

	}

}
