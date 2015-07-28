package com.milan.sym.domain;

import java.sql.SQLException;
import java.util.List;

public interface VisitDAO 
{

	void addVisit(Long customerId, List<Visit> list) throws SQLException;
	

}
