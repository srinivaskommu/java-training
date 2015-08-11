package com.milan.sym.web.ws.rest;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.milan.sym.adv.web.CustomerAction;
import com.milan.sym.domain.Customer;

@RestController
@RequestMapping(value = "/customer", headers = {"Accept=application/json"})
public class CustomerController 
{
	final static Logger logger = Logger.getLogger(CustomerController.class);
	  @RequestMapping(method = RequestMethod.POST)
	  public ResponseEntity<?> saveCustomer(@RequestBody Customer customer,@RequestHeader HttpHeaders headers)
	  {
		  logger.debug("test saveCustomer");
		    String cookie = null;
		    if (headers != null)
		    {
		      cookie = headers.getFirst("session");
		    }
		    HttpHeaders httpHeaders = new HttpHeaders();
		    httpHeaders.set("session", cookie);
		    
			customer.setCustomerId(100l);
			
			return new ResponseEntity<Customer>(customer, httpHeaders, HttpStatus.OK);
	  }
	@RequestMapping(method = RequestMethod.GET,produces = "application/json")
	public ResponseEntity<?> findAllCustomers(@RequestHeader HttpHeaders headers)
	{
		  logger.debug("test findAllCustomers");
	    String cookie = null;
	    if (headers != null)
	    {
	      cookie = headers.getFirst("session");
	    }
	    HttpHeaders httpHeaders = new HttpHeaders();
	    httpHeaders.set("session", cookie);
	    
		List<Customer> list = new ArrayList<Customer>();
		Customer cs = new Customer();
		cs.setFirstName("ROBERT");
		cs.setLastName("DOW");
		
		list.add(cs);
		
		
		Customer cs1 = new Customer();
		cs1.setFirstName("NANCY");
		cs1.setLastName("DOW");
		
		list.add(cs1);
		
		
		
	return new ResponseEntity<List<Customer>>(list, httpHeaders, HttpStatus.OK);
	}
	  
//	  @RequestMapping(value = "/{custid}", method = RequestMethod.GET)
//		public List<Customer> findAllCustomers()
//		{
	

}
