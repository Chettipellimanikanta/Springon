package com.spring.orm._ormEx;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm._ormEx.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         @SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("springconfig.xml");
         StudentDao dao= (StudentDao) ac.getBean("stDao",StudentDao.class);
         dao.toString();
         StudentBean std = new StudentBean();
//         std.setId(10);
//         std.setName("Mani");
//         std.setCourse("java");
//         dao.savestudent(std);
         
//      StudentBean s=   dao.viewstudentone(10);
//      System.out.println(s);
         
         //dao.deletestudent(10);
         
//        List<StudentBean>st=dao.StudentAll();
//        System.out.println(st);
         
         StudentBean studentone = dao.viewstudentone(10);
         //studentone.setId(102);
         studentone.setName("Manikanta");
         studentone.setCourse("Python");
         dao.updatestudent(studentone);
         System.out.println("updated successfylly");
    }
}
