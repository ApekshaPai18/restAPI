package com.example.restservice.entities;

public class Employee {
	
	private long employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String title;
	public Employee(long employee_id, String first_name, String last_name, String email, String title) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.title = title;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(long employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", title=" + title + ", getEmployee_id()=" + getEmployee_id()
				+ ", getFirst_name()=" + getFirst_name() + ", getLast_name()=" + getLast_name() + ", getEmail()="
				+ getEmail() + ", getTitle()=" + getTitle() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
	
