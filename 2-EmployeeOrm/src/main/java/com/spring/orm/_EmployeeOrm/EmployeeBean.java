package com.spring.orm._EmployeeOrm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeBean {
@Id
private int id;
private String name;
private int dept;
private int salary;
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
public int getDept() {
	return dept;
}
public void setDept(int dept) {
	this.dept = dept;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public EmployeeBean(int id, String name, int dept, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.salary = salary;
}
public EmployeeBean() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "EmployeeBean [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
}

}
