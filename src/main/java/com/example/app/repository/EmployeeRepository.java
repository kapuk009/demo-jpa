package com.example.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.app.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	@Query("SELECT employeeId, employeeName, employeeSurName, departmentId FROM Employee where employee_name like :employeeName")
	Iterable<Employee> findbyName(@Param("employeeName") String employeeName);
	
}
