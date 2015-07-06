package com.milan.test;

import java.util.HashSet;
import java.util.Set;

public class StudentImpl 
{
	private Set<Student> studentsInclass;
	
	public StudentImpl()
	{
		studentsInclass = new HashSet<Student>();
	}
	

	public void storeStudents(Student student)
	{
		studentsInclass.add(student);
	}

	public Set<Student> retrieveStduents()
	{
		return studentsInclass;
	}
	
	
	

}
