package com.hotelmgmt.process.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Categories.ExcludeCategory;

import com.hotelmgmt.process.PrfitCalculator;

public class PrfitCalculatorTest 
{
	PrfitCalculator pfc = new PrfitCalculator();

	@Test
	public void testcalculateBill() throws Exception 
	{
	
		int bill = pfc.calculateBill(null, 3);
		
		assertTrue(bill>0);
		assertEquals(600, bill);
		
	}
	
	@Test(expected =Exception.class )
	public void testcalculateBillForNegariveNumber() throws Exception 
	{

		int bill = pfc.calculateBill(null, -3);
		
	}
	
	

}
