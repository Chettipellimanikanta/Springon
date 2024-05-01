package com.Student._StudentsBean;

public class CollegeDetails {
private String collegeName;
private StudentDetails StudentDetails;
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public StudentDetails getStudentDetails() {
	return StudentDetails;
}
public void setStudentDetails(StudentDetails studentDetails) {
	StudentDetails = studentDetails;
}
public CollegeDetails(String collegeName, com.Student._StudentsBean.StudentDetails studentDetails) {
	super();
	this.collegeName = collegeName;
	StudentDetails = studentDetails;
}
public CollegeDetails() {
	super();
	// TODO Auto-generated constructor stub
}
public void details()
{
	System.out.println("College Name :"+ collegeName);
	System.out.println(StudentDetails.getName());
	System.out.println(StudentDetails.getNum());
	System.out.println(StudentDetails.getBranch());
}
}
