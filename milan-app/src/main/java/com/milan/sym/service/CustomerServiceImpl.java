package com.milan.sym.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.milan.sym.domain.AddressDAO;
import com.milan.sym.domain.Customer;
import com.milan.sym.domain.CustomerDAO;
import com.milan.sym.domain.CustomerDaoJDBCImpl;
import com.milan.sym.domain.VisitDAO;
import com.milan.sym.util.MilanDataBaseException;

public class CustomerServiceImpl implements CustomerService {

	@Autowired(required = true)
	CustomerDAO customerDao;

	@Autowired(required = true)
	AddressDAO addressDao;

	@Autowired(required = true)
	VisitDAO visitDao;

	public CustomerServiceImpl() throws ClassNotFoundException, SQLException {

	}

	public Customer saveCustomer(Customer customer)
			throws MilanDataBaseException {

		//

		// /addressDao.createAddress(response.getCustomerId(),customer.getAddress());

		//
		try {
			Customer response = customerDao.createCustomer(customer);
			visitDao.addVisit(response.getCustomerId(), customer.getVisits());

			return response;

		} catch (SQLException e) {
			throw new MilanDataBaseException(e.getMessage());
		}

	}

	public List<Customer> loadAllCustomers() {
		return customerDao.findAllCustomers();

	}

}
