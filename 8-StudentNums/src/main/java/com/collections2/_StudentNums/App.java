package com.collections2._StudentNums;

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
         AT At = (AT)context.getBean("institute");
         At.print();
    }
}
