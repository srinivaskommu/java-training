package com.milan.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {



	@Test
	public void testStudent() 
	{
		Address	studentAddress = new Address(" ELIS TS", "COMMERCE", "TX","75429");
		Student robert = new Student("robert", "mayor", "50001262", studentAddress);
		
		

		Student ram = new Student("sri ", "raman", "687678687678", null);
		
		
	}

}
