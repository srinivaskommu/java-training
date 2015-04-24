package com.hotelmgmt.domain;

 public class Customer 
 {
	 
		private String fName ;
		private String lName ;
		private Address customerAddress;
		
		
		public Customer(String a ,String b,Address address)
		{
			fName = a;
			lName = b;
			this.customerAddress = address;

		}
		
		
		
	 
	public static String prefix = "Mr";
	
	public String getfName() {
		return fName;
	}

//	public void setfName(String fName) {
//		this.fName = fName;
//	}

	public String getlName() {
		return lName;
	}

//	public void setlName(String lName) {
//		this.lName = lName;
//	}

	
	public String toString()
	{
		return "fName is" + this.fName +"\n"+"lName is" + this.lName;
	}
	
	public int hashCode()
	{
		
		return lName.hashCode();
		
	}
	
	public boolean equals(Object anyObject)
	{
		Customer cust = null;
		if(anyObject==null){
		return false;}
		
		else {
			cust = (Customer)anyObject;
			if(cust.getlName().equalsIgnoreCase(this.lName))
				return true;
			else
				return false;
			
		}
		
	}

	


	
	

	
}
