package com.milan.sym.domain.util;

public class MilanSqlUtil 
{
	public static final String CUSTOMER_INSERT_SEQ = "SELECT MILAN_customers_seq.nextval from dual"; 
	public static final String CUSTOMER_INSERT = 
			"INSERT INTO CUSTOMER (CUSTOMER_ID, LAST_NAAE, FIRST_NAME, IS_MEMBER, MEMBER_TYPE) VALUES (?, ?, ?, ?, ?)";
	
	public static final String VISIT_INSERT = "INSERT INTO VISIT (VISIT_ID, CUSTOMER_ID, VISIT_DESCRIPTION, VISIT_DATE, SERVICES_EXPENCE, PRODUCTS_EXPENCE) VALUES (?, ?, ?, ?,?, ?)";
	
	public static final String VISIT_INSERT_SEQ ="select MILAN_VISIT_seq.nextval from dual";
	
	public static final String QUERY_CUSTOMER = "SELECT CUSTOMER_ID, LAST_NAAE, FIRST_NAME, IS_MEMBER, MEMBER_TYPE FROM CUSTOMER WHERE CUSTOMER_ID = ?";
	public static final String QUERY_CUSTOMER_ALL = "SELECT CUSTOMER_ID, LAST_NAAE, FIRST_NAME, IS_MEMBER, MEMBER_TYPE FROM CUSTOMER";
	
//	UPDATE CUSTOMER SET CUSTOMER_ID = 0, LAST_NAAE = '', FIRST_NAME = '', IS_MEMBER = '', MEMBER_TYPE = '' WHERE CUSTOMER_ID = <condition>;




}
