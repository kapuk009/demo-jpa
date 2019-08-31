package com.example.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employee_id")
	private int employeeId;
	@Column(name="employee_name")
	private String employeeName;
	@Column(name="employee_surname")
	private String employeeSurName;
	@Column(name="department_id")
	private int departmentId;

	
	Employee(){}


	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getEmployeeSurName() {
		return employeeSurName;
	}


	public void setEmployeeSurName(String employeeSurName) {
		this.employeeSurName = employeeSurName;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	
	
	
	
}
