package com.hotelmgmt.domain;

public class PreferredCustomer extends Customer
{
	
	private Long frequentCustId;

	public PreferredCustomer(String a, String b,Long frequentCustId) {
		super(a, b);
		this.frequentCustId = frequentCustId;
		
	}

	

}
