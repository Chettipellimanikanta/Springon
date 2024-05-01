package com.spring.first._FirstApplication;

public class BeanClass {
	private int num1;
	private int num;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public BeanClass(int num1, int num) {
		super();
		this.num1 = num1;
		this.num = num;
	}
	
	 
	public BeanClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void printAddition()
	{
		int add=num1+num;
		System.out.println("Addition :"+add);
	}

}
