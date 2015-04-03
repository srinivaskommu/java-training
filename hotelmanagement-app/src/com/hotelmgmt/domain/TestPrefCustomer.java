package com.hotelmgmt.domain;

import java.util.Scanner;


public class TestPrefCustomer {

	public static void main(String[] args) 
	{
		System.out.println("Enter Customer1 Details");
		PreferredCustomer johnRefernece =readCustomerDetails();
		displayCustomerDetails(johnRefernece);
		
		
		System.out.println("Enter Customer2 Details");
		 johnRefernece =readCustomerDetails();
		displayCustomerDetails(johnRefernece);
		
		System.out.println("Enter Customer3 Details");
		 johnRefernece =readCustomerDetails();
		displayCustomerDetails(johnRefernece);


	}
	
	public static void displayCustomerDetails(PreferredCustomer john)
	{
		System.out.println(Customer.prefix);
		System.out.println("First Name "+john.getfName());
		System.out.println("Last Name "+john.getlName());	
		

		
	}
	
	public  static PreferredCustomer readCustomerDetails()
	{
		
		
		Scanner readInput = new Scanner(System.in);
		System.out.println("Enter the customer First Name ");
		String fname = readInput.next();
		
		System.out.println("Enter the customer Last Name ");
		String lname = readInput.next();
		
		System.out.println("Enter the customer ID ");
		Long id = readInput.nextLong();
		
		PreferredCustomer john = new PreferredCustomer(fname,lname,id);
		
		
		return john;
	}

}
