package com.manthan.empwebapp.util;

import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOImpl;

public class EmployeeDAOImplManager {
	
	
	private EmployeeDAOImplManager() {
	}
	
	public static EmployeeDAO getDAOInstance() {
		return new EmployeeDAOImpl();
	}

}
