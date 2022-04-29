package com.zee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zee.demo.model.Deparment;

public interface DepartmentRepository extends JpaRepository<Deparment, Integer> {

	// no code here as of now

}
