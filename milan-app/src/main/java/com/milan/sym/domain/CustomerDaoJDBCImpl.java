package com.milan.sym.domain;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import com.milan.sym.util.MilanDataBaseException;

public class CustomerDaoJDBCImpl implements CustomerDAO 
{
	private Connection conncetion;
	private Statement statement;
	private PreparedStatement psStatement;
	private CallableStatement csStatement;
	
	private ResultSet resultSet;
	static final String JDBC_DRIVER = "org.postgresql.Driver";  
	static final String DB_URL = "jdbc:postgresql://localhost/";
	String isertCustomer = "INSERT INTO customer (customer_name, is_member, member_type) VALUES (?, ?, ?)";

	/*
	CREATE OR REPLACE PROCEDURE add_customer
	(name VARCHAR(70), isMember boolean, memberType VARCHAR(50)) RETURNS void AS 
	$$ BEGIN 
	INSERT INTO customer (customer_name, is_member, member_type) VALUES (name, isMember, memberType);
	
	RETURNS insertedOrNot BOOLEAN;
	END;
	*/
	
	
	
	public CustomerDaoJDBCImpl(String dbName,String userName, String password) 
			throws ClassNotFoundException, SQLException
	{
		Class.forName(JDBC_DRIVER);
		this.conncetion = DriverManager.getConnection(DB_URL+dbName,userName,userName);
		
	}
	

	public Customer createCustomer(Customer customer) throws MilanDataBaseException
	{
		//statemnt --> execute once
		//preparestatement---> executes a precompiled query many time, it allows us to pass the parameters
		//callable statement--call stored procedure/function in database
		
		try {
			csStatement = this.conncetion.prepareCall("call add_customer(?,?,?)");
			csStatement.setString(1, customer.getName());
			csStatement.setBoolean(2, customer.isMember());
			csStatement.setString(3, customer.getMemberType());
			
			csStatement.registerOutParameter(1, Types.BOOLEAN);
			
			psStatement.executeQuery();
			
			psStatement.close();
			this.conncetion.close();
			
		} catch (SQLException e) {
			throw new MilanDataBaseException(e.getMessage());
		}
		

		return customer;
		
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
