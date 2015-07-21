package com.milan.sym.service;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.milan.sym.domain.Customer;
import com.milan.sym.domain.CustomerDAO;
import com.milan.sym.domain.CustomerDaoJDBCImpl;
import com.milan.sym.util.MilanDataBaseException;

public class CustomerServiceImpl implements CustomerService 
{
	
	@Autowired(required=true)
	CustomerDAO customerDao;
	

	public CustomerServiceImpl() throws ClassNotFoundException, SQLException 
	{
		
	}

	public void saveCustomer(Customer customer) throws MilanDataBaseException 
	{
		customerDao.createCustomer(customer);

	}



}
