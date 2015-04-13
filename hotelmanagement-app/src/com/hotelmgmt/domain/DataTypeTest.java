package com.hotelmgmt.domain;

public class DataTypeTest {

	public static void main(String[] s1) {
		
		
		//String[] s2 = {"Srini", "javaclass"};
		
		String[] s2 = new String[2];
		
		s2[0]= "Srini";
		s2[1] = "javaclass";
		
		
		
		
		if(s1[0].equalsIgnoreCase("test1"))
			System.out.println("job gets done");
		else
			System.out.println("job failed");
		
		DataType ref = new DataType();
		System.out.println(ref);
	
	

	
	

	}

}
