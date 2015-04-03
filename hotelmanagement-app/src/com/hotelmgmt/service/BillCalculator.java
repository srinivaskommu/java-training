package com.hotelmgmt.service;

import com.hotelmgmt.domain.Customer;

public class BillCalculator 
{
	public int calculateBill(Customer cust, int food)
	{
		
		int price = food*100;
		
		return price;
	}

}
