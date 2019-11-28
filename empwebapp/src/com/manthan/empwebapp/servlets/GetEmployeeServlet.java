package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet{


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		ServletContext context = getServletContext();
		String code = context.getInitParameter("countryCode");
		
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<h2> Employee Details: </h2><br>");
		out.println("Employee Name = Lipi <br>");
		out.println("Employee Salary = 500000 <br> ");
		out.println(code);
		out.println("</body>");
		out.println("</html>");


	}// end of doGet
}//end of main
