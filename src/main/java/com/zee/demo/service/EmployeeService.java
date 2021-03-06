package com.zee.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.demo.model.Employee;
import com.zee.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmployeeRepository repository;

	public List<Employee> getAllEmployees() {
		LOG.info("getAllEmployees");
		return repository.findAll();
	}

	public Employee getEmployeeById(int employeeId) {
		LOG.info("getEmployeeById " + employeeId);
		Optional<Employee> empOpt = repository.findById(employeeId);
		Employee empObj;
		try {
			empObj = empOpt.get();
			return empObj;
		} catch (NoSuchElementException e) {
			LOG.warn(e.getMessage());
			return null;
		}
	}

	public Employee getEmployeeByFirstName(String firstName) {
		LOG.info("getEmployeeByFirstName " + firstName);
		// please write necessary code here and in the repository
		return null;
	}

	public Employee addEmployee(Employee employee) {
		LOG.info("addEmployee " + employee.toString());
//		repository.find
		return repository.save(employee);
	}

	public Employee updateEmployee(Employee employee) {
		LOG.info("updateEmployee " + employee.toString());
		Optional<Employee> empOpt = repository.findById(employee.getEmployeeId());
		if (empOpt.isPresent()) {
			return repository.save(employee);
		} else {
			LOG.warn("Employee with employeeId " + employee.getEmployeeId() + " does not exist.");
			return null;
		}
	}

	public Employee deleteEmployee(int employeeId) {
		LOG.info("deleteEmployee " + employeeId);
		Employee emp = repository.findById(employeeId).get();
		// write logic here
		repository.delete(emp);
		return emp;
	}

}

//package com.zee.demo.service;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//import java.util.Optional;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.zee.demo.model.Employee;
//import com.zee.demo.repository.EmployeeRepository;
//
//// CRUD
//// getAllEmployees
//// getEmployeeById
//// addEmployee
//// updateEmployee
//// deleteEmployee
//
//// select * from employees;
//
//@Service
//public class EmployeeService {
//
//	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	private EmployeeRepository repository;
//
//	public List<Employee> getAllEmployees() {
//		LOG.info("getAllEmployees");
//		return repository.findAll();
//	}
//
//	public Employee getEmployeeById(int employeeId) {
//		LOG.info("getEmployeeById " + employeeId);
//		Optional<Employee> empOpt = repository.findById(employeeId);
//		Employee empObj;
//		try {
//			empObj = empOpt.get();
//			return empObj;
//		} catch (NoSuchElementException e) {
//			LOG.warn(e.getMessage());
//			return null;
//		}
//	}
//
//	public Employee getEmployeeByFirstName(String firstName) {
//		LOG.info("getEmployeeByFirstName " + firstName);
//		// please write necessary code here and in the repository
//		return null;
//	}
//
//	public Employee addEmployee(Employee employee) {
//		LOG.info("addEmployee " + employee.toString());
////		repository.find
//		return repository.save(employee);
//	}
//
//	public Employee updateEmployee(Employee employee) {
//		LOG.info("updateEmployee " + employee.toString());
//		// write logic here
//		return repository.save(employee);
//	}
//
//	public Employee deleteEmployee(int employeeId) {
//		LOG.info("deleteEmployee " + employeeId);
//		Employee emp = repository.findById(employeeId).get();
//		repository.delete(emp);
//		return emp;
//	}
//
//}
