package com.manthan.empwebapp.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.util.EmployeeDAOImplManager;
@WebServlet("/searchEmployee2")

public class SearchEmployee2 extends HttpServlet{
	
	private EmployeeDAO dao = EmployeeDAOImplManager.getDAOInstance();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int empIdVal = Integer.parseInt(req.getParameter("empId"));
		
		EmployeeInfoBean employeeInfoBean = dao.searchEmployee(empIdVal);
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		if(employeeInfoBean != null) {
			out.println("<h2>EmployeeID " + empIdVal +" Found</h2>");
			out.println("Employee Name = " + employeeInfoBean.getEmpName());
			out.println("<br>Age= "+ employeeInfoBean.getAge());
			out.println("<br>Salary = "+employeeInfoBean.getSalary());
		}
		else {
			out.println("<h2 style ='color: red;'>EmployeeId " + empIdVal + "Not Found</h2>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}

}
