/**
 * 
 */
package com.milan.sym.service;

import java.util.List;

import com.milan.sym.domain.Customer;
import com.milan.sym.util.MilanDataBaseException;

/**
 * @author srinivas_kommu
 *
 */
public interface CustomerService 
{
	Customer saveCustomer(Customer customer) throws MilanDataBaseException;
	List<Customer> loadAllCustomers(); 

}
