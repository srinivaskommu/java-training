package com.milan;

public class Student extends Person
{
	public Student(String name2, int height2, int weight2, char gender2) {
		super(name2, height2, weight2, gender2);
		
	}

	private String cwid;

	public String getCwid() {
		return cwid;
	}

	public void setCwid(String cwid) {
		this.cwid = cwid;
	}
	

}
