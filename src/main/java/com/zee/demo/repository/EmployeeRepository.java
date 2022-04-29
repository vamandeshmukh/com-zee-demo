package com.zee.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zee.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public abstract List<Employee> findByFirstName(String firstName);

//	public abstract List<Employee> findBySalary(double salary);

	@Query(name = "SELECT e FROM Employee WHERE e.salary = ?1") // JPQL 
	public abstract List<Employee> findBySalary(double salary);

	public abstract List<Employee> findBySalaryGreaterThan(double salary);

	public abstract List<Employee> findBySalaryLessThan(double salary);

	public abstract List<Employee> findBySalaryBetween(double salary1, double salary2);

	// no code as of now

	// write code to get employee by firstName
	// reference -
	// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation

}
