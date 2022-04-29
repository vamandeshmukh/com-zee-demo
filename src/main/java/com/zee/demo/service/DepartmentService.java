package com.zee.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.demo.model.Department;
import com.zee.demo.repository.DepartmentRepository;

// proper business logics to be written in this class 

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;

	public List<Department> getAllDepartments() {
		return repository.findAll();
	}

	public Department getDepartmentById(int departmentId) {
		return repository.findById(departmentId).get();
	}

	public Department addDepartment(Department department) {
		return repository.save(department);
	}

}
