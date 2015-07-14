package com.milan.demo;

public class Student 
{
	public Student(String firstName, String lastName, String cwid, Address address) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cwid = cwid;
		studentAddress = address;

	}
	private String firstName;
	private String lastName;
	private String cwid;
	Address studentAddress;

}
