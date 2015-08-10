package com.milan.sym.adv.web;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import com.milan.domain.ioc.Address;
import com.milan.sym.domain.Customer;
import com.milan.sym.domain.Visit;
import com.milan.sym.service.CustomerService;
import com.milan.sym.util.MilanDataBaseException;

public class CustomerAction extends ActionSupport
{
	final static Logger logger = Logger.getLogger(CustomerAction.class);
	
	@Autowired
	CustomerService service;
	
	public String execute()
	{
		
//		System.out.println("First NAme"+firstName);
		
		logger.debug("test");
		
		return "success";

	

	}
	

	private String firstName;
	private String lastName;
	private String isAMember;
	private String memberType;
	private Long customerId;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIsAMember() {
		return isAMember;
	}
	public void setIsAMember(String isAMember) {
		this.isAMember = isAMember;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	
	
	public void validate() 
	{
		
		 if(getFirstName().length()<1){  
		        addFieldError("firstName","Name can't be blank"); 
		        logger.error("error");
		 }

	}  

	
	

	



	

}
