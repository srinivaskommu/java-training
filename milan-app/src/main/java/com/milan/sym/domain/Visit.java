package com.milan.sym.domain;

import java.util.Date;

public class Visit 
{


	private Long visitId;
	private Long customerId;
	private Date visitDate;
	private double serviceExpense;
	private double productExpense; 


	private String description;
	
	public Visit(Long visitId, Long customerId, Date visitDate,
			double serviceExpense, double productExpense) {
		super();
		this.visitId = visitId;
		this.customerId = customerId;
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

	public Long getVisitId() {
		return visitId;
	}

	public void setVisitId(Long visitId) {
		this.visitId = visitId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public void setServiceExpense(double serviceExpense) {
		this.serviceExpense = serviceExpense;
	}

	public void setProductExpense(double productExpense) {
		this.productExpense = productExpense;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
