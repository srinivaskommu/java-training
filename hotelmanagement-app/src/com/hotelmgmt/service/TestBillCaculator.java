package com.hotelmgmt.service;

import com.hotelmgmt.process.PrfitCalculator;

public class TestBillCaculator 

{
	
	public static void main(String s[]) {
		
		BillCalculator billCalc = new BillCalculator();
		System.out.println(billCalc.calculateBill(null, 10));
		
		
		PrfitCalculator calculator = new PrfitCalculator();
		System.out.println(calculator.calculateBill(null, 200));
		
		
		
	}

}
