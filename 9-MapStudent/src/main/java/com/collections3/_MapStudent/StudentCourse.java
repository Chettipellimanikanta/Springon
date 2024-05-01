package com.collections3._MapStudent;

import java.util.Map;

public class StudentCourse {
private Map<String, String>stuCourses;

public Map<String, String> getStuCourses() {
	return stuCourses;
}

public void setStuCourses(Map<String, String> stuCourses) {
	this.stuCourses = stuCourses;
}

public StudentCourse(Map<String, String> stuCourses) {
	super();
	this.stuCourses = stuCourses;
}

public StudentCourse() {
	super();
	// TODO Auto-generated constructor stub
}
public void print()
{
	 for(Map.Entry<String,String>entry:stuCourses.entrySet())
	 {
		 System.out.println(entry.getKey()+":"+entry.getValue());
	 }
}
}
