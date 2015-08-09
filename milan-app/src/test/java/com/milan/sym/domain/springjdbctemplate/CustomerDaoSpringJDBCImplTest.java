package com.milan.sym.domain.springjdbctemplate;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.milan.sym.domain.CustomerDAO;
import com.milan.sym.service.CustomerService;

public class CustomerDaoSpringJDBCImplTest 
{
	CustomerDaoSpringJDBCImpl customerDAO;
	ApplicationContext ctx;
	CustomerService customerService;
	

	@Before
	public void setUp() throws Exception 
	{
		ctx = new ClassPathXmlApplicationContext("milanbeans.xml");
		customerDAO = (CustomerDaoSpringJDBCImpl)ctx.getBean("customerDao");
		customerService = (CustomerService)ctx.getBean("customerService");
		
	}

	@Test
	public void testCustomerDaoSpringJDBCImpl() 
	{
		assertNotNull(customerDAO);
		assertNotNull(customerService);
		
	}

	//@Test
	public void testCreateCustomer() {
		fail("Not yet implemented");
	}

	//@Test
	public void testUpdateCustomer() {
		fail("Not yet implemented");
	}

	//@Test
	public void testFindCustimerById() {
		fail("Not yet implemented");
	}

	//@Test
	public void testFindCustomerByName() {
		fail("Not yet implemented");
	}

	//@Test
	public void testDeleteCustomer() {
		fail("Not yet implemented");
	}

	//@Test
	public void testFindAllCustomers() {
		fail("Not yet implemented");
	}

}
