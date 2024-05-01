package com.collections2._StudentNums;

import java.util.Set;

public class AT {
private Set<Integer>studentRollNums;

public Set<Integer> getStudentRollNums() {
	return studentRollNums;
}

public void setStudentRollNums(Set<Integer> studentRollNums) {
	this.studentRollNums = studentRollNums;
}

public AT(Set<Integer> studentRollNums) {
	super();
	this.studentRollNums = studentRollNums;
}

public AT() {
	super();
	// TODO Auto-generated constructor stub
}
public void print()
{
	for(Integer stunum : studentRollNums)
	{
	System.out.println(stunum );
	}
}
}
