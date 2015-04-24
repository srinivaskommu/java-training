package com.hotelmgmt.domain;

public class Address 
{
	private String streetName;
	private String aptNo;
	private String city;
	private String state;
	private int zipCode;
	
	public Address()
	{

		this.streetName="200 University part";
		aptNo = "Unit 4";
		city = "terrahaut";
		state= "IN";
		zipCode = 67014;
	}
	
	public Address(String streetName,String aptNo,
			String city, String state, int zipCode)
	{
		this.streetName = streetName;
		this.aptNo = aptNo;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		
	}
	

}
