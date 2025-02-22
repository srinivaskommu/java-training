package com.milan.sym.web.ws.soap;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.milan.sym.domain.Customer;
import com.milan.sym.service.CustomerService;

@WebService(endpointInterface = "com.milan.sym.web.ws.soap.CustomerWebService", 
serviceName = "CustomerWebServiceSOAPImpl", 
targetNamespace = "http://services.mialn.app.com")
public class CustomerWebServiceSOAPImpl implements CustomerWebService 
{
//	@Autowired
//	CustomerService customerService;

	public Customer saveCustomer(Customer customer) 
	{
		
		customer.setCustomerId(100l);
		
		return customer;
	}

	public List<Customer> findAllCustomers() 
	{
		List<Customer> list = new ArrayList<Customer>();
		Customer cs = new Customer();
		cs.setFirstName("ROBERT");
		cs.setLastName("DOW");
		
		
		
		list.add(cs);
		
		
		Customer cs1 = new Customer();
		cs1.setFirstName("NANCY");
		cs1.setLastName("DOW");
		
		list.add(cs1);
		
		return list;
	}

}
