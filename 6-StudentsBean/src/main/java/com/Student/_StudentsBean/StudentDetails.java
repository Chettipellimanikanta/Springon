package com.Student._StudentsBean;

public class StudentDetails {
 private String name;
 private int num;
 private String branch;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public StudentDetails(String name, int num, String branch) {
	super();
	this.name = name;
	this.num = num;
	this.branch = branch;
}
public StudentDetails() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
