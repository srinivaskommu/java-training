package com.milan;

class Test 
{

	public static void main (String[] arrays)
	{
		System.out.println("THIS IS A JAR");
		Test test = new Test();
		test.display();
		test.display("something");
		
	}
	
	
	public void display()
	{
		System.out.println("no arguments display method");
	}
	
	
	public void display(String displayThis)
	{
		System.out.println("no arguments display method"+displayThis);
	}
	
	public void display(String displayThis, int no)
	{
		System.out.println("no arguments display method"+displayThis);
	}
	
}


