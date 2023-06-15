package com.example.restservice.services;

import java.util.List;

import com.example.restservice.entities.Employee;


public interface Employees {
	public List<Employee>getEmployee();
	public Employee getEmployee(long employee_id);
	public Employee addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Employee deleteEmployee(long employee_id);
	

}
