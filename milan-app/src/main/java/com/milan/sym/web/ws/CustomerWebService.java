package com.milan.sym.web.ws;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebParam;

import com.milan.sym.domain.Customer;

@WebService(targetNamespace = "http://services.milan.app.com")
public interface CustomerWebService 
{
	Customer saveCustomer(@WebParam(name = "customer")Customer customer);
	List<Customer> findAllCustomers(); 

}
