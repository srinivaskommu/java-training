package com.isko.app.service;

import java.sql.SQLException;
import java.util.List;

import com.isko.app.domain.Student;

public interface StudentService 
{
	int saveStudent(Student student) throws ClassNotFoundException, SQLException;
	Student findStudentById(Long studentId);
	List<Student> findStudentByName(String studentName);
	

}
