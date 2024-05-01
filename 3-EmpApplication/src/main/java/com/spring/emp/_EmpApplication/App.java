package com.spring.emp._EmpApplication;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//         Resource res=new ClassPathResource("springconfig.xml");
//         XmlBeanFactory factory = new XmlBeanFactory(res);
//         EmpClass myBean = (EmpClass)factory.getBean("Employee");
//         myBean.details();
    	Resource res=new FileSystemResource("C:\\Users\\ganesh chettipelli\\Desktop\\FileSystem");
        XmlBeanFactory factory = new XmlBeanFactory(res);
        EmpClass myBean = (EmpClass)factory.getBean("Employee");
        myBean.details();
    }
}
