package com.milan.sym.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDaoJDBCImpl implements CustomerDAO 
{
	private Connection conncetion;
	private Statement statement;
	private ResultSet resultSet;
	static final String JDBC_DRIVER = "org.postgresql.Driver";  
	static final String DB_URL = "jdbc:postgresql://localhost/";
	
	
	public CustomerDaoJDBCImpl(String dbName,String userName, String password) 
			throws ClassNotFoundException, SQLException
	{
		Class.forName(JDBC_DRIVER);
		this.conncetion = DriverManager.getConnection(DB_URL+dbName,userName,userName);
		
	}

	public void createCustomer(Customer customer) 
	{
	
		
	}

	public void updateCustomer(Customer customer) {
		
		
	}

	public void findCustimerById(long id) {
		
		
	}

	public void findCustomerByName(String name) {
		
		
	}

	public void deleteCustomer(Customer customer) {
		
		
	}

}
