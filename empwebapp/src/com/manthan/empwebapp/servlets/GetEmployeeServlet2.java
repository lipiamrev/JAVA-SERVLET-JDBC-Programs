package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String empId = req.getParameter("empId");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h2> Employee Details: </h2><br>");
		out.println("Name : Lipi <br>");
		out.println("Salary : 258963 <br>");
		out.println("Emp ID: " + empId);
		out.println("</body>");
		out.println("</html>");
		
	}

}
