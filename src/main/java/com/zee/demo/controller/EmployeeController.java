package com.zee.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zee.demo.model.Employee;
import com.zee.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EmployeeService service;

//	http://localhost:8888/emp/get-all-emps
	@GetMapping("/get-all-emps")
	public List<Employee> getAllEmps() {
		LOG.info("getAllEmps");
		return service.getAllEmployees();
	}

////	http://localhost:8888/emp/get-all-emps
//	@GetMapping("/get-all-emps")
//	public ResponseEntity<List<Employee>> getAllEmps() {
//		LOG.info("getAllEmps");
//		return new ResponseEntity<List<Employee>>(service.getAllEmployees(), HttpStatus.OK);
//	}

//	http://localhost:8888/emp/get-emp-by-id/{eid}
	@GetMapping("/get-emp-by-id/{eid}")
	public Employee getEmpById(@PathVariable(name = "eid") int employeeId) {
		LOG.info(Integer.toString(employeeId));
		return service.getEmployeeById(employeeId);
	}

//	http://localhost:8888/emp/get-emp-by-first-name/{firstName}
	@GetMapping("/get-emp-by-first-name/{firstName}")
	public Employee getEmpByFirstName(@PathVariable(name = "firstName") String firstName) {
		LOG.info(firstName);
		return service.getEmployeeByFirstName(firstName);
	}

	// http://localhost:8888/emp/add-emp
	@PostMapping("/add-emp")
	public Employee addEmp(@RequestBody Employee employee) {
		System.out.println(employee.toString());
		return service.addEmployee(employee);
	}

//	http://localhost:8888/emp/update-emp
	@PutMapping("/update-emp")
	public Employee updateEmp(@RequestBody Employee employee) {
		LOG.info(employee.toString());
		return service.updateEmployee(employee);
	}

//	http://localhost:8888/emp/delete-emp/{eid}
	@DeleteMapping("/delete-emp/{eid}")
	public Employee deleteEmp(@PathVariable(name = "eid") int employeeId) {
		LOG.info(Integer.toString(employeeId));
		return service.deleteEmployee(employeeId);
	}

}
