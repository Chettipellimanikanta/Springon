package com.Student._StudentsBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
         CollegeDetails cd = (CollegeDetails)context.getBean("clg");
         cd.details();
    }
}