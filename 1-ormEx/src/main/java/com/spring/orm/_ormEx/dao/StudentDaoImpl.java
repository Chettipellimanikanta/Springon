package com.spring.orm._ormEx.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm._ormEx.StudentBean;

public class StudentDaoImpl implements StudentDao{
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDaoImpl(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	@Transactional
	@Override
	public int savestudent(StudentBean studentBean) {
		// TODO Auto-generated method stub
		int savedetails=(int) hibernateTemplate.save(studentBean);
		return savedetails;
	}

	@Override
	public StudentBean viewstudentone(int id) {
		// TODO Auto-generated method stub
		StudentBean view= hibernateTemplate.get(StudentBean.class, id);
		return view ;
	}

	@Override
	@Transactional
	public void updatestudent(StudentBean studentBean) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(studentBean);
		
	}
	@Override
	@Transactional
	public void deletestudent(int id) {
		// TODO Auto-generated method stub
		StudentBean std = hibernateTemplate.get(StudentBean.class,id);
		if(std!=null)
		{
			hibernateTemplate.delete(std);
		}
		
	}

	@Override
	public List<StudentBean> StudentAll() {
		// TODO Auto-generated method stub
		List<StudentBean>st=hibernateTemplate.loadAll(StudentBean.class);
		return st;
	}

	
	 
}
