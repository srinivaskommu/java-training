/**
 * 
 */
package com.isko.app.domain.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Random;

import com.isko.app.domain.Student;

/**
 * @author srinivas_kommu
 *
 */
public class StudentDAOImpl implements StudentDAO {

	Connection connection;
	PreparedStatement stmt;
	ResultSet rs;

	public StudentDAOImpl(String driverName, String dbUrl, String dbUserName,
			String password) throws ClassNotFoundException, SQLException {
		Class.forName(driverName);

		// create the connection
		connection = DriverManager.getConnection(dbUrl, "olp_v126",
				"olp_v126");

	}

	public void insertStudent(Student student) throws SQLException {
		if (student == null)
			throw new RuntimeException("input cant be null");
//
		String query = "insert into STUDENT (STUDENT_ID, LAST_NAAE,FIRST_NAME) values (?,?,?)";
		


		// load the driver

		student.setStudentId(getStudentIdNextVal());

		// create statemnt
		PreparedStatement stmt = connection.prepareStatement(query);
		stmt.setLong(1, student.getStudentId());
		stmt.setString(2, student.getFirstName());
		stmt.setString(3, student.getLastName());

		// execute the query & loop through
		stmt.executeUpdate();

		stmt.close();
		connection.close();
		
		

	}

	private Long getStudentIdNextVal() throws SQLException 
	{
		Statement stmt = connection.createStatement();
		rs = stmt.executeQuery("select isko_student_seq.nextval from dual");
		rs.next();
		
		Long stduentId = rs.getLong(1);
		
		
				rs.close();
				stmt.close();


		return stduentId;
	}
	
	public void close() throws SQLException
	{
		connection.close();
		
	}

	public List<Student> selectAllStudents() throws SQLException 
	{
		String query = "SELECT * FROM STUDENT";
		stmt = connection.prepareStatement(query);
		rs = stmt.executeQuery();
		
		
		//TODO: VISHNU
		
		
		//create a stduent in while loop and assign values on to it instead of printing and add it to list.
		while(rs.next())
		{
			System.out.println(rs.getLong(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println("------");
			
			
		}
		
		
		rs.close();
		stmt.close();
		
		
	
		return null;
	}

}
