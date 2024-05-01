package com.spring.orm._EmployeeOrm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm._EmployeeOrm.EmployeeBean;

public class EmployeeDaoImpl implements EmployeeDao{
	
	public HibernateTemplate hibernateTemplate;
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

	public EmployeeDaoImpl(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}
	

	public EmployeeDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Transactional
	@Override
	public int saveemployee(EmployeeBean employeeBean) {
		// TODO Auto-generated method stub
		int savedetails = (int) hibernateTemplate.save(employeeBean);
		return savedetails;
	}

	@Override
	public EmployeeBean viewemployeeone(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateemployee(EmployeeBean employeeBean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteemployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<EmployeeBean> EmployeeAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
