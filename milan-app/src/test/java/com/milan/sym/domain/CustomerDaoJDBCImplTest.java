//package com.milan.sym.domain;
//
//import static org.junit.Assert.*;
//import junit.framework.Assert;
//
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.milan.sym.util.MilanDataBaseException;
//
//
//public class CustomerDaoJDBCImplTest {
//	@Autowired
//	CustomerDAO customerDAO;
//
//	@Before
//	public void setUp() throws Exception {
//		//customerDAO = new CustomerDaoJDBCImpl("", "", "");
//	}
//
//	@After
//	public void tearDown() throws Exception {
//	}
//
//	@Test
//	public void testCreateCustomer() throws MilanDataBaseException {
//
//		Customer robert = new Customer();
//		robert.setName("robert");
//		robert.setMember(true);
//		robert.setMemberType("gold");
//		
//
//		Customer insertedRecord= customerDAO.createCustomer(robert);
//		assertNotNull(insertedRecord);
//		assertEquals(robert.getName(), insertedRecord.getName());
//		
//		
//		
//		
//		Customer nancy = new Customer();
//		nancy.setName("nancy");
//		nancy.setMember(true);
//		nancy.setMemberType("gold");
//		
//		
//		customerDAO.createCustomer(nancy);
//		
//		
//		Customer john = new Customer();
//		john.setName("john");
//		john.setMember(true);
//		john.setMemberType("gold");
//		
//		
//		customerDAO.createCustomer(john);
//			
//		
//		Customer chris = new Customer();
//		chris.setName("john");
//		chris.setMember(true);
//		chris.setMemberType("gold");
//		
//		
//		customerDAO.createCustomer(chris);
//		
//
//	}
//
//	// @Test
//	// public void testUpdateCustomer() {
//	// fail("Not yet implemented");
//	// }
//	//
//	// @Test
//	// public void testFindCustimerById() {
//	// fail("Not yet implemented");
//	// }
//	//
//	// @Test
//	// public void testFindCustomerByName() {
//	// fail("Not yet implemented");
//	// }
//	//
//	// @Test
//	// public void testDeleteCustomer() {
//	// fail("Not yet implemented");
//	// }
//
//}
