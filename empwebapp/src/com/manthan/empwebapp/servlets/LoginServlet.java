package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.util.EmployeeDAOImplManager;

@WebServlet("/login")

public class LoginServlet extends HttpServlet {
	
	private EmployeeDAO dao = EmployeeDAOImplManager.getDAOInstance();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			int empIdVal = Integer.parseInt(req.getParameter("empId"));
			String passwordVal = req.getParameter("password");
			
			EmployeeInfoBean employeeInfoBean = dao.authenticate(empIdVal, passwordVal);
			
			PrintWriter out =resp.getWriter();
			
			out.println("<html>");
			out.println("<body>");
			
			if(employeeInfoBean != null) {
				//Valid Credentials
				HttpSession session =req.getSession(true);
				session.setAttribute("employeeInfoBean", employeeInfoBean);
				session.setMaxInactiveInterval(30);
				
				out.println("<h2>Welcome " + employeeInfoBean.getEmpName() + "<h2>");
				out.println("<a href = './addEmployee.html'>Add New Employee</a><br>");
				out.println("<a href = './searchEmployee.html'>Search Employee</a><br>");
				out.println("<a href='./updateEmployee.html'>Update Employee</a><br>");
				out.println("<a href='./deleteEmployee.html'>Delete Employee</a><br>");
				out.println("<a href='./logout'>Logout</a>");
			}
			else {
				//Invalid Credentials
				out.println("invalid Credentials!!<br>");
				req.getRequestDispatcher("./loginPage.html").include(req, resp);
			}
			out.println("</body>");
			out.println("</html>");
	}//end of doPost
			

}//end of class
