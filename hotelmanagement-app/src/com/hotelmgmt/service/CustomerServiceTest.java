/**
 * 
 */
package com.hotelmgmt.service;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.hotelmgmt.domain.Customer;

/**
 * @author srinivas_kommu
 *
 */
public class CustomerServiceTest 
{
	CustomerService customerService = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception 
	{
		customerService = new CustomerService();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void testAddCustomerSet()
	{
		Set result = customerService.getCustomerDetailsSet();
		
		Customer cust4 = new Customer("srini", "k");
		result.add(cust4);
		Customer cust1 = new Customer("john", "pogan1");
		result.add(cust1);
		Customer cust2 = new Customer("john", "becon1");
		result.add(cust2);
		Customer cust3 = new Customer("john", "taylor1");
		result.add(cust3);
		
		assertEquals(7, result.size());
	
	}
	
	
	@Test
	public void testAddCustomer()
	{
		List result = customerService.getCustomerDetailsList();
		
		Customer cust4 = new Customer("srini", "k");
		result.add(cust4);
		Customer cust1 = new Customer("john", "pogan");
		result.add(cust1);
		Customer cust2 = new Customer("john", "becon");
		result.add(cust2);
		Customer cust3 = new Customer("john", "taylor");
		result.add(cust3);
		
		assertEquals(7, result.size());
	
	}
	

	@Test
	public void testGetCustomerDetailsList() 
	{
		
		List result = customerService.getCustomerDetailsList();
		assertNotNull(result);
		
		
		
	}
	
	
	@Test
	public void testGetCustomerDetailsListSize() 
	{
		List result = customerService.getCustomerDetailsList();
		assertEquals(3, result.size());
	
	}
	
	@Test
	public void testCustomerDetails() 
	{
		List result = customerService.getCustomerDetailsList();
		
		Iterator it = 	result.iterator();
		Customer cust = null;
		
		while(it.hasNext())
		{
			cust = (Customer)it.next();
			
			if(cust!=null)
			{
				if(cust.getlName().equalsIgnoreCase("pogan"))
					assertEquals("pogan", cust.getlName());
					
					if(cust.getlName().equalsIgnoreCase("becon"))
					assertEquals("becon", cust.getlName());
					
					if(cust.getlName().equalsIgnoreCase("tylor"))
					assertEquals("tylor", cust.getlName());
				
			}
		
		}
	
	
	
	}
	
	

}
