package com.spring.Student._StudentApplication;

public class StudentBean {
	private int id;
	private String name;
	private String course;
	private int batch;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getBatch() {
		return batch;
	}
	public void setBatch(int batch) {
		this.batch = batch;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public StudentBean(int id, String name, String course, int batch, String location) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.batch = batch;
		this.location = location;
	}
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void details(){
		System.out.println("Emp id :"+id);
		System.out.println("Emp name :"+name);
		System.out.println("Emp course :"+course);
		System.out.println("Emp batch :"+batch);
		System.out.println("Emp location :"+location);
	}
}
