package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyFirstServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Date date = new Date();
		
		resp.setHeader("refresh", "1");
		
		ServletConfig config = getServletConfig();
		String msg = config.getInitParameter("message");
		
		ServletContext context = req.getServletContext();
		String code =context.getInitParameter("countryCode");
		
		PrintWriter out = resp.getWriter(); //to display anything on screen
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Current time and date-<br>" + date + "</h1>");
		out.println(msg);
		out.println("<br> country code = " + code);
		out.print("</body>");
		out.print("</html>");
	}//End of doGet()
 	
}//End of Class
