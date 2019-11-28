package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchEmployee")

public class SearchEmployeeServlet extends HttpServlet {



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String emp = req.getParameter("empId");
		int empId = Integer.parseInt(emp);

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		PrintWriter out = resp.getWriter();

		try
		{

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db", "root", "root");

			String query = "select * from employee_info where emp_id = ?" ;
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();

			out.println("<html>");
			out.println("<body>");

			if(rs.next()) {

				out.println("<h2> Employee ID : " + emp + "Found:</h2>" );
				out.println("Name: " + rs.getString("emp_name"));
				out.println("<br> Age: " + rs.getInt("age"));
				out.println("<br> Salary: " +rs.getDouble("salary"));
				out.println("<br> Designation: " +rs.getString("designation"));
				out.println("<br> Mobile: "+rs.getLong("mobile"));
			}//end of try
			else {
				out.println("EmpID is not found");
			}
			out.println("<a href='./logout'>Logout</a>");
			out.println("</body>");
			out.println("</html>");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			out.close();
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}


		}//end of finally	
	}		



}// end of class
