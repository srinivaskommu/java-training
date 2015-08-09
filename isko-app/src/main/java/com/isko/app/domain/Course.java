package com.isko.app.domain;

public class Course 
{
	private String courseName;
	private int courseDuration;
	private double courseFee;

//	public Course(String courseName, int courseDuration, double courseFee) {
//		super();
//		this.courseName = courseName;
//		this.courseDuration = courseDuration;
//		this.courseFee = courseFee;
//	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

}
