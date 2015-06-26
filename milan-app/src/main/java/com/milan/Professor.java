package com.milan;

public class Professor extends Person
{
	private String employeeId;

	public Professor(String name, int height, int weight, char gender) 
	{
	super(name,  height,  weight,  gender);
	
		
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	
	public void setWeight(int weight) {
		if(weight>0&& weight<1000)
		{
			super.setWeight(weight);
		}
	
	}

}
