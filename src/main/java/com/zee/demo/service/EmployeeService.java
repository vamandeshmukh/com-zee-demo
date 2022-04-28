package com.zee.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.demo.model.Employee;
import com.zee.demo.repository.EmployeeRepository;

// CRUD
// getAllEmployees
// getEmployeeById
// addEmployee
// updateEmployee
// deleteEmployee

// select * from employees;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public List<Employee> getAllEmployees() {
		System.out.println("getAllEmployees");
		return repository.findAll();
	}

	public Employee getEmployeeById(int employeeId) {
		System.out.println("getEmployeeById" + employeeId);
		return repository.findById(employeeId).get();
	}

	public Employee addEmployee(Employee employee) {
		System.out.println("addEmployee");
		return repository.save(employee);
	}

	public Employee updateEmployee(Employee employee) {
		// write logic here 
		return repository.save(employee);
	}

	public Employee deleteEmployee(int employeeId) {
		Employee emp = repository.findById(employeeId).get();
		repository.delete(emp);
		return emp;
	}

}
