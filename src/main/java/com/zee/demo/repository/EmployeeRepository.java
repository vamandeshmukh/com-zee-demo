package com.zee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zee.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
