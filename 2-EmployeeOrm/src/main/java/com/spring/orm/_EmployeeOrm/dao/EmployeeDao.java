package com.spring.orm._EmployeeOrm.dao;

import java.util.List;

import com.spring.orm._EmployeeOrm.EmployeeBean;

public interface EmployeeDao {
public int saveemployee(EmployeeBean employeeBean);
public EmployeeBean viewemployeeone(int id);
public void updateemployee(EmployeeBean employeeBean);
public void deleteemployee(int id);
public List<EmployeeBean> EmployeeAll();
}
