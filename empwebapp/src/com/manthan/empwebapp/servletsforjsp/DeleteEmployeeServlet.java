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

@WebServlet("/deleteEmp")

public class DeleteEmployeeServlet extends HttpServlet{
	
	private EmployeeDAO dao = new EmployeeDAOImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		
		if (session != null) {
			int EmpId = Integer.parseInt(req.getParameter("empId"));
			
			
			if (dao.deleteEmployee(EmpId)) {
				req.setAttribute("msg", "Employee deleted");
			}
			else {
				req.setAttribute("msg", "failed");
			}
			req.getRequestDispatcher("/deletePage").forward(req, resp);
			
		}
		else {
			req.setAttribute("msg", "Please login first");
			req.getRequestDispatcher("/loginPage").forward(req, resp);
		}
	}
		}
	
