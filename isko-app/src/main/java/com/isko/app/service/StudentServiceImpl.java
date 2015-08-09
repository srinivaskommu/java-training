package com.isko.app.service;

import java.sql.SQLException;
import java.util.List;

import com.isko.app.domain.Course;
import com.isko.app.domain.Student;
import com.isko.app.domain.dao.CourseDAO;
import com.isko.app.domain.dao.StudentDAO;

public class StudentServiceImpl implements StudentService 
{
	
	StudentDAO studentDao;
	CourseDAO courseDao;
	
	public StudentServiceImpl(StudentDAO studentDao,CourseDAO courseDao)
	{
		
		
		
	}
	

	public int saveStudent(Student student) throws ClassNotFoundException, SQLException {
		
		studentDao.insertStudent(student);
		
		for(Course course:student.getCourses())
		{
			courseDao.insertCourse(course);
			
		}
		
		return 0;
	}

	public Student findStudentById(Long studentId) {
		
		return null;
	}

	public List<Student> findStudentByName(String studentName) {
		
		return null;
	}
	

}
