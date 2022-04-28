package com.zee.demo;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zee.demo.service.EmployeeService;

@SpringBootApplication
public class ComZeeDemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(ComZeeDemoApplication.class, args);

		System.out.println("Start");

		EmployeeService service = new EmployeeService();

		System.out.println(service.getAllEmployees().toString());

		System.out.println("End");

	}

}