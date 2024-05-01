package com.annotationbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
	@Value("1")
	private int id;
	@Value("Mani")
	private String name;
	@Value("Developer")
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public EmployeeBean(int id, String name, String role) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
	}
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(role);
	}
}
