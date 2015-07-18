package com.isko.app.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProfessorTest 
{
	Professor nancy;
	Professor robert;
	Professor robertJr;

	@Before
	public void setUp() throws Exception 
	{
		
		nancy = new Professor("100","nancy                      ", "cole",'F');
		 robert = new Professor("101","robert", "cole", 'M');
		 robertJr = new Professor("102","robert", "cole", 'M');
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testProfessor() 
	{
		System.out.println(nancy.getFirstName());
		System.out.println(nancy.getFirstName());
//		
//		System.out.println(nancy.hashCode());
//		System.out.println(robert.hashCode());
//		System.out.println(robertJr.hashCode());
//		
//		if(robert.hashCode() == robertJr.hashCode())
//		{
//			System.out.println("BOTH ARE EQUAL");
//		}else {
//			System.out.println("BOTH ARE NOT EQUAL");
//		}
		
		
	}

//	@Test
//	public void testHashCode() 
//	{
//		fail("Not yet implemented");
//	}


//
//	@Test
//	public void testProfessorStringStringChar() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetFirstName() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetFirstName() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetLastName() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetLastName() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetGender() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testSetGender() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}

}
