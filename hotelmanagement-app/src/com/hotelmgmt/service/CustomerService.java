package com.hotelmgmt.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.hotelmgmt.domain.Customer;

public  class CustomerService 
{
	
	
	//abstract void addCustomer();
	
	public void provideHotelAddress(){
		
		System.out.println("Burger King Terra hut, IN");  
		
	}
	
	public List getCustomerDetailsList() 
	{
		Customer cust1 = new Customer("john", "pogan");
		Customer cust2 = new Customer("john", "becon");
		Customer cust3 = new Customer("john", "taylor");
		
		
		List list = new ArrayList();
		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		
		
		
		return list;
	}
	
	public Set getCustomerDetailsSet() 
	{
		Customer cust1 = new Customer("john", "pogan");
		Customer cust2 = new Customer("john", "becon");
		Customer cust3 = new Customer("john", "taylor");
		
		
		Set list = new HashSet();
		list.add(cust1);
		list.add(cust2);
		list.add(cust3);
		
		
		
		return list;
	}
	
	
	public Customer[] getAllCustomerDetails() throws Exception
	{

		Customer[] customerList = new Customer[4];
		Customer defaultCust= null;
		
		Customer cust1 = new Customer("john", "pogan");
		Customer cust2 = new Customer("john", "becon");
		Customer cust3 = new Customer("john", "taylor");
		
		
		customerList [0] = cust3;
		customerList [1] = cust2;
		customerList [2] = cust1;
		
		System.out.println("length"+customerList.length);
		
		for (int i = 0; i<customerList.length; i++)
		{
			
			try
			{
				System.out.println(customerList [i].getfName());
				System.out.println(customerList [i].getlName());
			}catch(Exception e)
			{
//				System.out.println("oops..there was no customer reocords, please add details");
//				Scanner in = new Scanner(System.in);
//				System.out.println("Enter the customer fname");
//				String fname = in.next();
//				
//				System.out.println("Enter the customer Lname");
//				String lname = in.next();
//				
//				defaultCust = new Customer(fname, lname);
//				
//				customerList[i] = defaultCust;
				
				throw new Exception("please add the missing customer details");
				
				
			} finally {
				System.out.println("total number of customers in the system "+(i+1));
				
				
			}
			
			
			


		}
		
		return customerList;

	
	}
	
	
	


}
