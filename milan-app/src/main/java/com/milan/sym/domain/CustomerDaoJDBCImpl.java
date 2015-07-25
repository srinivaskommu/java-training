package com.milan.sym.domain;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.List;

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


	
	
	
	public CustomerDaoJDBCImpl(String dbName,String userName, String password) 
			throws ClassNotFoundException, SQLException
	{
//		Class.forName(JDBC_DRIVER);
//		this.conncetion = DriverManager.getConnection(DB_URL+dbName,userName,userName);
		
	}
	

	public Customer createCustomer(Customer customer) throws MilanDataBaseException
	{
		return null;
		
	}

	public void updateCustomer(Customer customer) {
		
		
	}

	public void findCustimerById(long id) {
		
	
		
		
	}

	public void findCustomerByName(String name) {
		
//	String selectQuery = "SELCT cus where cust= ?"
//				
//				ps = 
//				ps.setString(1, name);
//	ps.execute();
		
	}

	public void deleteCustomer(Customer customer) {
		
		
	}


	public List<Customer> findAllCustomers() 
	{
		//statement
		//fire--state.exe
		//result set
		//close
		
		
		return null;
	}

}
