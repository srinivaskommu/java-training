package com.isko.app.domain.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class StudentDAOTest 
{
	StudentDAO dao;

	@Before
	public void setUp() throws Exception 
	{
		dao = new StudentDAOImpl();
	}

	@Test
	public void testInsertStudent() throws ClassNotFoundException, SQLException 
	{
		dao.insertStudent(null);
	}

}
