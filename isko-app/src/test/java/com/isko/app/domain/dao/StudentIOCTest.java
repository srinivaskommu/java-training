package com.isko.app.domain.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.isko.app.domain.Course;
import com.isko.app.domain.Student;

public class StudentIOCTest 
{

	BeanFactory factory;

	@Before
	public void setUp() throws Exception 
	{
		Resource resource=new ClassPathResource("applicationContext.xml");  
		 factory=new XmlBeanFactory(resource);  
	}
	
	
	
	@Test
	public void testStudentIOC()
	{
		Student john = (Student) factory.getBean("john");
		
		assertNotNull(john);
		assertEquals("john", john.getFirstName());
		assertEquals("mayor", john.getLastName());
		assertNotNull(john.getEnrolledCourse());
		assertEquals("AGJO101", john.getEnrolledCourse().getCourseName());
		
		
	
		
	}



}
