package com.isko.app.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentServiceTest {
	ApplicationContext context;
	StudentService studentService;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");

		assertNotNull(context);

		studentService = (StudentService) context.getBean("studentService");
		assertNotNull(studentService);

	}

	@Test
	public void testSaveStudent() {

		fail("Not yet implemented");
	}

	@Test
	public void testFindStudentById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindStudentByName() {
		fail("Not yet implemented");
	}

}
