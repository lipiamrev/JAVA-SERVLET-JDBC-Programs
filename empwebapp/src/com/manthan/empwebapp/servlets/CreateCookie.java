package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/createCookie")
public class CreateCookie extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie cookie = new Cookie("empname", "sam") ;
		resp.addCookie(cookie);
		
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Cookie added </h2>");
		out.println("</body>");
		out.println("</html>");
		
}
}