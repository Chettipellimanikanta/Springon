package com.spring.orm._EmployeeOrm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm._EmployeeOrm.dao.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("springconfig.xml");
        EmployeeDao dao = (EmployeeDao) ac.getBean("empDao");
        dao.toString();
        
        EmployeeBean emp =  new EmployeeBean();
        emp.setId(101);
        emp.setName("Mani");
        emp.setDept(1);
        emp.setSalary(10001);
    }
}
