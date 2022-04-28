package com.zee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zee.demo.model.Employee;
import com.zee.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

//	http://localhost:8888/hello
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello");
		return "Hello world!";
	}

//	http://localhost:8888/get-all-emps
	@GetMapping("/get-all-emps")
	public List<Employee> getAllEmps() {
		System.out.println("getAllEmps");
		return service.getAllEmployees();
	}

//	http://localhost:8888/get-emp-by-id/{eid}
	@GetMapping("/get-emp-by-id/{eid}")
	public Employee getEmpById(@PathVariable(name = "eid") int employeeId) {
		System.out.println("getEmpById");
		return service.getEmployeeById(employeeId);
	}
}










