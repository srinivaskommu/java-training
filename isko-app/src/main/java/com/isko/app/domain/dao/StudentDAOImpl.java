/**
 * 
 */
package com.isko.app.domain.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.isko.app.domain.Student;

/**
 * @author srinivas_kommu
 *
 */
public class StudentDAOImpl implements StudentDAO {

	public void insertStudent(Student student) throws ClassNotFoundException,
			SQLException 
	{
		String query = "insert into STUDENT (STUDENT_ID, LAST_NAAE,FIRST_NAME) values (102,'nancy','dow')";

		// load the driver
		Class.forName("oracle.jdbc.OracleDriver");

		// create the connection
		Connection connection = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:test", "test",
				"test");

		// create statemnt
		Statement stmt = connection.createStatement();

		// execute the query & loop through
		stmt.execute(query);

		stmt.close();
		connection.close();

	}

}
