package com.javabased._StudentBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentBean {
	@Value("1")
private int sId;
	 @Value("Mani")
private String sName;
	 @Value("Full Stack")
private String sCourse;
	 @Value("Java")
private String SBatch;
public int getsId() {
	return sId;
}
public void setsId(int sId) {
	this.sId = sId;
}
public String getsName() {
	return sName;
}
public void setsName(String sName) {
	this.sName = sName;
}
public String getsCourse() {
	return sCourse;
}
public void setsCourse(String sCourse) {
	this.sCourse = sCourse;
}
public String getSBatch() {
	return SBatch;
}
public void setSBatch(String sBatch) {
	SBatch = sBatch;
}
public StudentBean(int sId, String sName, String sCourse, String sBatch) {
	super();
	this.sId = sId;
	this.sName = sName;
	this.sCourse = sCourse;
	SBatch = sBatch;
}
public StudentBean() {
	super();
	// TODO Auto-generated constructor stub
}
public void display()
{
	System.out.println(sId);
	System.out.println(sName);
	System.out.println(sCourse);
	System.out.println(SBatch);
}
}
