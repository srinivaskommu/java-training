package com.isko.app.domain.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.isko.app.domain.Course;

public class CourseDAOTemplateImpl implements CourseDAO 
{
	Connection connection;
	PreparedStatement stmt;
	ResultSet rs;
	public CourseDAOTemplateImpl(String driverName, String dbUrl, String dbUserName,
			String password) throws ClassNotFoundException, SQLException {
		Class.forName(driverName);

		// create the connection
		connection = DriverManager.getConnection(dbUrl, "olp_v126",
				"olp_v126");

	}

	public int insertCourse(Course course) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateCourse(Course course) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Course findCourseByCourseId() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Course> findAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

}
