package com.zee.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zee.demo.model.Department;
import com.zee.demo.service.DepartmentService;

@RestController
@RequestMapping("/dep")
public class DepartmentController {

	private Logger LOG = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private DepartmentService service;

	@GetMapping("/get-all-deps")
	public List<Department> getAllDeps() {
		LOG.info("getAllDeps");
		return service.getAllDepartments();
	}

	@GetMapping("/get-dep-by-id/{did}")
	public Department getDepById(@PathVariable(name = "did") int departmentId) {
		LOG.info(Integer.toString(departmentId));
		return service.getDepartmentById(departmentId);
	}

	@PostMapping("/add-dep")
	public Department addDep(@RequestBody Department department) {
		LOG.info(department.toString());
		return service.addDepartment(department);
	}

}




//add dep 
//{
//  "departmentName": "string",
//  "city": "string"
//}
//add emp with dep 
//{
//  "firstName": "string",
//  "salary": 0,
//  "department": {
//    "departmentId": xxx
//  }
//}
//add emp without dep 
//{
//  "firstName": "string",
//  "salary": 0
//}
//
