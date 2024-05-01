package com.collections3._MapStudent;

import java.util.Properties;
import java.util.Set;

public class StudentBatches {
private Properties stuBatches;

public Properties getStuBatches() {
	return stuBatches;
}

public void setStuBatches(Properties stuBatches) {
	this.stuBatches = stuBatches;
}

public StudentBatches(Properties stuBatches) {
	super();
	this.stuBatches = stuBatches;
}

public StudentBatches() {
	super();
	// TODO Auto-generated constructor stub
}
public void print()
{
	Set<String>keys=stuBatches.stringPropertyNames();
	for(String key:keys)
	{
		System.out.println(key+":"+stuBatches.getProperty(key));
	}
}
}
