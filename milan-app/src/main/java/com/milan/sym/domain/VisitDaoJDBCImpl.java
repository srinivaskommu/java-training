package com.milan.sym.domain;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;

import org.apache.commons.beanutils.converters.SqlTimestampConverter;
import org.apache.commons.lang.time.DateUtils;

import com.milan.sym.domain.util.MilanSqlUtil;

public class VisitDaoJDBCImpl implements VisitDAO 
{
	private Connection conncetion;
	private Statement statement;
	private PreparedStatement psStatement;
	private CallableStatement csStatement;
	private ResultSet resultSet;
	
	
	public VisitDaoJDBCImpl(String driverName, String dbName,
			String userName, String password) throws ClassNotFoundException,
			SQLException 
	{
		Class.forName(driverName);
		this.conncetion = DriverManager.getConnection(dbName, userName,
				userName);

	}


	public void addVisit(Long customerId, List<Visit> list) throws SQLException 
	{
		psStatement = this.conncetion.prepareStatement(MilanSqlUtil.VISIT_INSERT);

		for(Visit visit: list)
		{
			visit.setVisitId(readNextVisitIdSeqValue());
			psStatement.setLong(1, visit.getVisitId());
			psStatement.setLong(2, customerId);
			psStatement.setString(3,visit.getDescription() );
			
			Timestamp ts = new Timestamp(visit.getVisitDate().getTime());
			
			psStatement.setTimestamp(4,ts);
			psStatement.setDouble(5, visit.getServiceExpense());
			psStatement.setDouble(6, visit.getProductExpense());
			
			psStatement.addBatch();
			
		}
		
		
		psStatement.executeBatch();
		
		
	}
	
	
	private Long readNextVisitIdSeqValue() throws SQLException 
	{
		Long customerId = 0l;
		statement = this.conncetion.createStatement();
		resultSet = statement.executeQuery(MilanSqlUtil.VISIT_INSERT_SEQ);
		resultSet.next();
		
		customerId = resultSet.getLong(1);
		
		return customerId;
	}

}
