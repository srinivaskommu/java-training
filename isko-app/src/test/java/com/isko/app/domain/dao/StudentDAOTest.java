package com.isko.app.domain.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.isko.app.domain.Course;
import com.isko.app.domain.Student;

public class StudentDAOTest 
{
	StudentDAOImpl dao;

	@Before
	public void setUp() throws Exception 
	{
		dao = new StudentDAOImpl("oracle.jdbc.OracleDriver","jdbc:oracle:thin:@10.0.38.115:8080:test","etst","test");
	}
	
	@After
	public void close() throws Exception 
	{
		dao.close();
	}

	@Test(expected=RuntimeException.class)
	public void testInsertStudentNull() throws ClassNotFoundException, SQLException 
	{
		dao.insertStudent(null);
	}
	@Test
	public void testInsertStudent() throws ClassNotFoundException, SQLException 
	{
		Student robert = new Student("raman"+(System.currentTimeMillis()/1000), "singh",null);
		dao.insertStudent(robert);
		
	}
	
	@Test
	public void testSelectAllStudenrs() throws SQLException  
	{
		
		dao.selectAllStudents();
	}
	
	@Test
	public void testStudentIOC()
	{
		Course agri = new Course();
		Course chem = new Course();
		Course int0 = new Course();
		
		
		Student john = new Student("jphn", "johon", int0);
		Student mayor = new Student("nancy ","mayor", null);
		
	}

}
