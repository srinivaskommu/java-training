package com.milan.sym.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.milan.sym.domain.CustomerDAO;

public class MilanConfig 
{

	public static void main(String[] args) 
	{
	    Resource resource=new ClassPathResource("milanbeans.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    CustomerDAO customerDao=(CustomerDAO)factory.getBean("customerDaoImpl");  

		
//		ApplicationContext context =   
//			    new ClassPathXmlApplicationContext("milanbeans.xml");  
		

	}

}
