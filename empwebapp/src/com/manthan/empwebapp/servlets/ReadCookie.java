package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookie")

public class ReadCookie extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie [] cookies = req.getCookies();
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		for(Cookie cookie : cookies) {
			out.println("<br> CookieName are: " + cookie.getName());
			out.println("<br> CookieValue are: " + cookie.getValue());
		}
		out.println("</body>");
		out.println("</html>");
		
	}

}
