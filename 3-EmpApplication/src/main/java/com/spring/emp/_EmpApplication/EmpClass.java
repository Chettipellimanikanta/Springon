package com.spring.emp._EmpApplication;

public class EmpClass {
	private String name;
	private int id;
	private double salary;
	private int deptnum;
	private String doj;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDeptnum() {
		return deptnum;
	}

	public void setDeptnum(int deptnum) {
		this.deptnum = deptnum;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}
	

	public EmpClass(String name, int id, double salary, int deptnum, String doj) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.deptnum = deptnum;
		this.doj = doj;
	}
	

	public EmpClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void details(){
		System.out.println("Emp Name :"+name);
		System.out.println("Emp Id :"+id);
		System.out.println("Emp Salary :"+salary);
		System.out.println("Emp Dept Num :"+deptnum);
		System.out.println("Emp DOJ :"+doj);
	}
}
