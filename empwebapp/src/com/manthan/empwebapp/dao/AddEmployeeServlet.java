package com.manthan.empwebapp.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.util.EmployeeDAOImplManager;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet {
	
	EmployeeDAO dao = EmployeeDAOImplManager.getDAOInstance();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		HttpSession session = req.getSession(false);
		if (session != null) {
			
			EmployeeInfoBean bean = (EmployeeInfoBean) session.getAttribute("employeeInfoBean");
			
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
		
		out.println("<html>");
		out.println("<body>");
		
		if (dao.addEmployee(employeeInfoBean)){
			out.println("<h2>record added</h2>");
			out.println("<h3> Thanks " + bean.getEmpName());
		}
		else {
			out.println("<h2>record not added</h2>");
			out.println("<h3>Sorry " + bean.getEmpName());
		}
		out.println("<a href='./logout'>Logout</a>");
		out.println("</body>");
		out.println("</html>");
	}
	
	else {
		out.println("<h2> Please Login First </h2>");
		req.getRequestDispatcher("./loginPage.html").include(req, resp);
	}
		
		out.println("</body>");
		out.println("</html>");
	
	
	}
	
}
