package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.util.EmployeeDAOImplManager;

@WebServlet("/updateEmployee")

public class UpdateEmployeeServlet extends HttpServlet{

	EmployeeDAO dao = EmployeeDAOImplManager.getDAOInstance();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<body>");

		HttpSession session = req.getSession(false);
		if (session != null) {

			long mobileVal = Long.parseLong(req.getParameter("mobile"));
			int empIdVal = Integer.parseInt(req.getParameter("empId"));

			if (dao.updateEmployee(empIdVal, mobileVal)){
				out.println("<h2>record updated</h2>");
			}
			else {
				out.println("<h2>record not updated</h2>");
			}
		}

		else {
			out.println("<h2> Please Login First </h2>");
			req.getRequestDispatcher("./loginPage.html").include(req, resp);
		}

		out.println("<a href='./logout'>Logout</a>");
		out.println("</body>");
		out.println("</html>");
	}


}

