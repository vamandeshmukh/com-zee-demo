package com.zee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.zee.demo.model.Department;
import com.zee.demo.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	private DepartmentService service;

	public List<Department> getAllDeps() {
		return service.getAllDepartments();
	}

	public Department getDepById(int departmentId) {
		return service.getDepartmentById(departmentId);
	}
}
