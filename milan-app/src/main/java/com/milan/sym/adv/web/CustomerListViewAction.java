package com.milan.sym.adv.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import  com.milan.sym.domain.*;
import com.milan.sym.service.CustomerService;

public class CustomerListViewAction 
{
//	@Autowired
//	CustomerService customerService;
	
	private List<Customer> customerList;
	
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	
	
	public String execute()
	{
		

		//customerList = customerService.loadAllCustomers();
		
		
		return "success";
	}

}
