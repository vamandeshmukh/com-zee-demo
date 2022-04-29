package com.zee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zee.demo.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	// no code here as of now

}
