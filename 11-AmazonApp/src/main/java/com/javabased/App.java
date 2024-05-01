package com.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.orm._ormEx.StudentBean;
import com.spring.orm._ormEx.dao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext c = new AnnotationConfigApplicationContext(JavaConfig.class);
        ProductBean pb =(ProductBean) c.getBean("getProd");
        pb.printproduct();
        
        
    }
}
