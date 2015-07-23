package com.milan.sym.domain;

import java.sql.SQLException;
import java.util.List;

import com.milan.sym.util.MilanDataBaseException;

public interface CustomerDAO 
{
	Customer createCustomer(Customer customer) throws MilanDataBaseException;
	void updateCustomer(Customer customer);
	void findCustimerById(long id);
	void findCustomerByName(String name);
	void deleteCustomer(Customer customer);
	List<Customer> findAllCustomers();

}
