package com.hotelmgmt.domain;

public class TestCustomer {

	public static void main(String[] args) 
	{
		
		System.out.println("command line arguments"+args[0]);
		
		if(args!=null&&args.length>0){
			Customer johnRefernece = new Customer("john","pogan",new Address());
			displayCustomerDetails(johnRefernece);
			
			Customer elise = new Customer("elise","yang",null);
			displayCustomerDetails(johnRefernece);
			
			Customer mark = new Customer("mark", "smith", new Address("37 clarin", "unit 4", "LA", "CA", 90034));
			displayCustomerDetails(mark);
			
			
			
			Customer chris = new Customer("chris","taylor",null);
			displayCustomerDetails(chris);
			
			
			//equals --- compare object equality
			
		if(chris.equals(mark))
		{
			System.out.println("mark & chris equal");
		}else{
			System.out.println("mark & mark are not equal");
		}
		

			
		}
		
		

	
	}
	
	
	public static void displayCustomerDetails(Customer john)
	{
		System.out.println(Customer.prefix);
		System.out.println("First Name "+john.getfName());
		System.out.println("Last Name "+john.getlName());	
		
		
		//calling the inherited methods from super class java.lang.Object
		
		System.out.println("hash code "+john.hashCode());
		System.out.println(john.toString());
		
		

		

		
	}

}
