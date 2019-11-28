package com.manthan.empwebapp.dao;

import com.manthan.empwebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {

	
	public EmployeeInfoBean searchEmployee(int empId);
	
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
	
	public  EmployeeInfoBean authenticate (int empId, String password);
	
	public boolean deleteEmployee (int empId);
	
	public boolean updateEmployee (int empId, long mobile);
	
	
}// end of DAO
