package com.milan.sym.domain.util;

public class MilanSqlUtil 
{
	public static String CUSTOMER_INSERT_SEQ = "SELECT MILAN_customers_seq.nextval from dual"; 
	public static String CUSTOMER_INSERT = 
			"INSERT INTO CUSTOMER (CUSTOMER_ID, LAST_NAAE, FIRST_NAME, IS_MEMBER, MEMBER_TYPE) VALUES (?, ?, ?, ?, ?)";
	
	
	
//	UPDATE CUSTOMER SET CUSTOMER_ID = 0, LAST_NAAE = '', FIRST_NAME = '', IS_MEMBER = '', MEMBER_TYPE = '' WHERE CUSTOMER_ID = <condition>;
//	SELECT CUSTOMER_ID, LAST_NAAE, FIRST_NAME, IS_MEMBER, MEMBER_TYPE FROM CUSTOMER;



}
