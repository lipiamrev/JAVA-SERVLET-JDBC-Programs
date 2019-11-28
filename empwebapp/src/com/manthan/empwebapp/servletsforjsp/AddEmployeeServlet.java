package com.manthan.empwebapp.servletsforjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOImpl;

@WebServlet("/addEmp")

public class AddEmployeeServlet extends HttpServlet{
	private EmployeeDAO dao = new EmployeeDAOImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		
		if(session != null) {
			
			int empId = Integer.parseInt(req.getParameter("empId"));
			String empName = req.getParameter("empName");
			int age = Integer.parseInt(req.getParameter("age"));
			double salary = Double.parseDouble(req.getParameter("salary"));
			String designation = req.getParameter("designation");
			long mobile = Long.parseLong(req.getParameter("mobile"));
			
			EmployeeInfoBean employeeInfoBean = new EmployeeInfoBean();
			
			employeeInfoBean.setEmpId(empId);
			employeeInfoBean.setEmpName(empName);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setSalary(salary);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setMobile(mobile);
			
			if(dao.addEmployee(employeeInfoBean)) {
				req.setAttribute("msg", "Employee added");
			}
			else {
				req.setAttribute("msg", "failed");
			}
			req.getRequestDispatcher("/addPage").forward(req, resp);
			
		}
		else {
			req.setAttribute("msg", "Please login first");
			req.getRequestDispatcher("/loginPage").forward(req, resp);
		}
	}
}
