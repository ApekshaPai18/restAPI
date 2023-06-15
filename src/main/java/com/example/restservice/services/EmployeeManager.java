package com.example.restservice.services;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.restservice.entities.Employee;


@Service
public class EmployeeManager implements Employees {

	List<Employee>list;
public EmployeeManager() {
		
		list=new ArrayList<>();
		list.add(new Employee(123,"Kakashi","Hatake","kakashi@gmail.com","CEO"));
		list.add(new Employee(124,"Naruto","Uzumaki","naruto@gmail.com","manager"));
		list.add(new Employee(125,"Itachi","Uchiha","itachi@gmail.com","staff"));
		list.add(new Employee(126,"Zoro","Rorona","zoro@gmail.com","staff"));
	}

	@Override
	public List<Employee> getEmployee() {
		return list;
	}
	
	
	@Override
	public Employee getEmployee(Long employee_id) {
		Employee c=null;
		for(Employee employee:list)
		{
			if(employee.getEmployee_id()==employee_id) {
				c=employee;
				break;
				
			}
		}
		return c;
	}


	
	

	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		list.add(employee);
		return employee;
	}



	@Override
	public Employee updateEmployee(Employee employee) {
		list.forEach(e->{
			if(e.getEmployee_id()==employee. getEmployee_id()) {
				e.setTitle(employee.getTitle());
				e.setFirst_name(employee.getFirst_name());
				e.setLast_name(employee.getLast_name());
				e.setEmail(employee.getEmail());
				e.setTitle(employee.getTitle());
			}
			});
		return employee;
	}

	@Override
	public Employee deleteEmployee(Long parseLong) {
		list=this.list.stream().filter(e->e.getEmployee_id()!=parseLong).collect(Collectors.toList());
		return null;
		
	}
	
	

}

