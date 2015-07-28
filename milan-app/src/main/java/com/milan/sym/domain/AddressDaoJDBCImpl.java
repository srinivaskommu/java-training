package com.milan.sym.domain;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.milan.domain.ioc.Address;

public class AddressDaoJDBCImpl implements AddressDAO 
{
	
	private Connection conncetion;
	private Statement statement;
	private PreparedStatement psStatement;
	private CallableStatement csStatement;

	private ResultSet resultSet;

	public AddressDaoJDBCImpl(String driverName, String dbName,
			String userName, String password) throws ClassNotFoundException,
			SQLException 
	{
		Class.forName(driverName);
		this.conncetion = DriverManager.getConnection(dbName, userName,
				userName);

	}

	public void createAddress(Long customerId, Address address) {
		
	}
	

}
