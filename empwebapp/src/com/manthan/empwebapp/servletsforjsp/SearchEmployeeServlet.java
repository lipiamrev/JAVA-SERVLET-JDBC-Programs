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

@WebServlet("/searchEmp")

public class SearchEmployeeServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);
		if(session != null) {
			int empId = Integer.parseInt(req.getParameter("empId"));
			EmployeeDAO dao = new EmployeeDAOImpl();
			EmployeeInfoBean employeeInfoBean = dao.searchEmployee(empId);
			
			if(employeeInfoBean != null) {
				req.setAttribute("searchEmployee", employeeInfoBean);
			}
			else {
				req.setAttribute("msg", "Employee ID is not found");
			}
			
			req.getRequestDispatcher("./searchPage").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "Please login first");
			req.getRequestDispatcher("./loginPage").forward(req, resp);
		}
	}

}
