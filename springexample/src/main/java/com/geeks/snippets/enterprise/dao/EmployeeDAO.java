package com.geeks.snippets.enterprise.dao;

import com.geeks.snippets.enterprise.Employee;

public interface EmployeeDAO {

		public void insert(Employee employee);
		public Employee findById(int id);
}
