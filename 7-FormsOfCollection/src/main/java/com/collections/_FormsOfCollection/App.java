package com.collections._FormsOfCollection;

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
        AmeerpetTechnologiesBean At = (AmeerpetTechnologiesBean)context.getBean("institute");
        At.print();
    }
}
