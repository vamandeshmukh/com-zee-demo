package com.zee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zee.demo.model.Employee;
import com.zee.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

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

//	http://localhost:8888/get-emp-by-first-name/{firstName}
	@GetMapping("/get-emp-by-first-name/{firstName}")
	public Employee getEmpByFirstName(@PathVariable(name = "firstName") String firstName) {
		System.out.println(firstName);
		return service.getEmployeeByFirstName(firstName);
	}

	// http://localhost:8888/add-emp
	@PostMapping("/add-emp")
	public Employee addEmp(@RequestBody Employee employee) {
		System.out.println(employee.toString());
		return service.addEmployee(employee);
	}

//	http://localhost:8888/update-emp
	@PutMapping("/update-emp")
	public Employee updateEmp(@RequestBody Employee employee) {
		System.out.println(employee.toString());
		return service.updateEmployee(employee);
	}

//	http://localhost:8888//delete-emp/{eid}
	@DeleteMapping("/delete-emp/{eid}")
	public Employee deleteEmp(@PathVariable(name = "eid") int employeeId) {
		System.out.println(employeeId);
		return service.deleteEmployee(employeeId);
	}

}
