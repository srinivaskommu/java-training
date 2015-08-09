package com.isko.app.domain;

import java.util.List;

public class Student 
{
	static String schoolName = "UTD";
	private Long studentId;
	private String firstName;
	private String lastName;
	private List<Course> courses;
	
	
	public Student(String f, String l,Course courseName)
	{
		firstName = f;
		lastName = l;
		enrolledCourse = courseName;
		
	}
	
	
	
	public static String getSchoolName() {
		return schoolName;
	}


	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}


	public Course getEnrolledCourse() {
		return enrolledCourse;
	}


	public void setEnrolledCourse(Course enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}


	private Course enrolledCourse;
	


	public String getFirstName() 
	{
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
	public Long getStudentId() {
		return studentId;
	}


	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}


	@Override
	public int hashCode() 
	{
		int result = 1;
		result =  result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result =  result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}



	public List<Course> getCourses() {
		return courses;
	}



	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	

	
	
	
}
