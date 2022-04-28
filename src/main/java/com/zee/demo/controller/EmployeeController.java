package com.zee.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

//	http://localhost:8888/hello

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello");
		return "Hello world!";
	}

}
