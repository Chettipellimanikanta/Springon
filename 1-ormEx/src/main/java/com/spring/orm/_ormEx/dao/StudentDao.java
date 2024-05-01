package com.spring.orm._ormEx.dao;

import java.util.List;

import com.spring.orm._ormEx.StudentBean;


public interface StudentDao {
	public int savestudent(StudentBean studentBean);
	public StudentBean viewstudentone(int id);
	public void updatestudent(StudentBean studentBean);
	public void deletestudent(int id);
	public List<StudentBean> StudentAll();
}
