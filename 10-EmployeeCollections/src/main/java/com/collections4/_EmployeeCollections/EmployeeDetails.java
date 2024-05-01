package com.collections4._EmployeeCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class EmployeeDetails {
private List<String>empNames;
private Set<Integer>empNums;
private Map<String,Integer>empDeptNames;
private Properties empSalary;
public List<String> getEmpNames() {
	return empNames;
}
public void setEmpNames(List<String> empNames) {
	this.empNames = empNames;
}
public Set<Integer> getEmpNums() {
	return empNums;
}
public void setEmpNums(Set<Integer> empNums) {
	this.empNums = empNums;
}
public Map<String, Integer> getEmpDeptNames() {
	return empDeptNames;
}
public void setEmpDeptNums(Map<String, Integer> empDeptNames) {
	this.empDeptNames = empDeptNames;
}
public Properties getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(Properties empSalary) {
	this.empSalary = empSalary;
}
public EmployeeDetails(List<String> empNames, Set<Integer> empNums, Map<String, Integer> empDeptNums,
		Properties empSalary) {
	super();
	this.empNames = empNames;
	this.empNums = empNums;
	this.empDeptNames = empDeptNames;
	this.empSalary = empSalary;
}
public EmployeeDetails() {
	super();
	// TODO Auto-generated constructor stub
}

}
