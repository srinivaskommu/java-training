/**
 * 
 */
package com.milan.sym.service;

import com.milan.sym.domain.Customer;
import com.milan.sym.util.MilanDataBaseException;

/**
 * @author srinivas_kommu
 *
 */
public interface CustomerService 
{
	void saveCustomer(Customer customer) throws MilanDataBaseException;

}
