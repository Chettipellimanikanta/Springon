package com.collections._FormsOfCollection;

import java.util.List;

public class AmeerpetTechnologiesBean {
private List <String> studentNames;

public List<String> getStudentNames() {
	return studentNames;
}

public void setStudentNames(List<String> studentNames) {
	this.studentNames = studentNames;
}

public AmeerpetTechnologiesBean(List<String> studentNames) {
	super();
	this.studentNames = studentNames;
}

public AmeerpetTechnologiesBean() {
	super();
	// TODO Auto-generated constructor stub
}
public void print()
{
	for(String stuname : studentNames)
	{
	System.out.println(stuname);
	}
}
}
