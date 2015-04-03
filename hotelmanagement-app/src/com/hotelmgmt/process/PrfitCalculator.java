package com.hotelmgmt.process;

import com.hotelmgmt.domain.Customer;
import com.hotelmgmt.domain.PreferredCustomer;
import com.hotelmgmt.service.BillCalculator;

public class PrfitCalculator extends BillCalculator
{
	
	
	public int calculateBill(Customer cust, int food)
	{
		super.calculateBill(cust,food);
		
		int price = food*200;
		
		return price;
	}
	
	

}
