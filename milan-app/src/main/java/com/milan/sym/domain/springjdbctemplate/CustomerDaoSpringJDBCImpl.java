package com.milan.sym.domain.springjdbctemplate;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.incrementer.PostgreSQLSequenceMaxValueIncrementer;

import com.milan.sym.domain.Customer;
import com.milan.sym.domain.CustomerDAO;
import com.milan.sym.domain.util.MilanSqlUtil;
import com.milan.sym.util.MilanDataBaseException;

public class CustomerDaoSpringJDBCImpl implements CustomerDAO 
{
	JdbcTemplate template;
	@Autowired
	PostgreSQLSequenceMaxValueIncrementer customerIdSeq;

	public CustomerDaoSpringJDBCImpl (DataSource datasource)
	{
		template = new JdbcTemplate(datasource);
		
	}
	
	
	public Customer createCustomer(Customer customer)  throws MilanDataBaseException 
	{
		int result = template.update(
				MilanSqlUtil.CUSTOMER_INSERT,
				new Object[]{
						customerIdSeq.nextLongValue()		,
				customer.getFirstName(),
				customer.getLastName(),
				customer.getIsAMember(),
				customer.getMemberType()
				});
		
	
		if(result > 0)
			return customer;
		return null;
	}

	public void updateCustomer(Customer customer) 
	{
		
		
	}

	public void findCustimerById(long id) 
	{
		Customer customer = template.queryForObject(
				MilanSqlUtil.QUERY_CUSTOMER,
				new Object[]{id},
				Customer.class);
		
	}

	public void findCustomerByName(String name) {
		
		
	}

	public void deleteCustomer(Customer customer) {
		
		
	}

	public List<Customer> findAllCustomers() 
	{
		List<Customer> result = template.queryForList(MilanSqlUtil.QUERY_CUSTOMER_ALL,
				Customer.class);
		
		return result;
	}

}
