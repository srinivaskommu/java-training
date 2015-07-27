package com.milan.sym.domain;

import java.util.Date;

public class Visit 
{
	
	private Date visitDate;
	private double serviceExpense;
	private double productExpense; 
	
	public Visit(Date visitDate, double serviceExpense, double productExpense) {
		super();
		this.visitDate = visitDate;
		this.serviceExpense = serviceExpense;
		this.productExpense = productExpense;
	}
	
	public Date getVisitDate() {
		return visitDate;
	}

	public double getServiceExpense() {
		return serviceExpense;
	}

	public double getProductExpense() {
		return productExpense;
	}


	
	
	
	

}
