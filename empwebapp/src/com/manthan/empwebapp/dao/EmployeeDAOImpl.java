package com.manthan.empwebapp.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.manthan.empwebapp.beans.EmployeeInfoBean;

public class EmployeeDAOImpl implements EmployeeDAO {


	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {

		Connection con= null;
		PreparedStatement pstmt = null;

		boolean isAdded = false;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db", "root", "root");

			String query = "insert into employee_info value(?, ?, ?, ?, ?, ?, ?);";

			pstmt = con.prepareStatement(query);

			pstmt.setInt(1, employeeInfoBean.getEmpId());
			pstmt.setString(2, employeeInfoBean.getEmpName());
			pstmt.setInt(3, employeeInfoBean.getAge());
			pstmt.setDouble(4, employeeInfoBean.getSalary());
			pstmt.setString(5, employeeInfoBean.getDesignation());
			pstmt.setLong(6, employeeInfoBean.getMobile());
			pstmt.setString(7, "qwerty");

			int n =pstmt.executeUpdate();

			if(n>0) {
				isAdded = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
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


		}
		return isAdded;
	}

	@Override
	public EmployeeInfoBean searchEmployee(int empId) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;


		EmployeeInfoBean employeeInfoBean = null;
		try
		{

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db", "root", "root");

			String query = "select * from employee_info where emp_id = ?" ;
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				employeeInfoBean = new EmployeeInfoBean();

				employeeInfoBean.setEmpId(rs.getInt("emp_id"));
				employeeInfoBean.setEmpName(rs.getString("emp_name"));
				employeeInfoBean.setAge(rs.getInt("age"));
				employeeInfoBean.setSalary(rs.getDouble("salary"));
				employeeInfoBean.setDesignation(rs.getString("designation"));
				employeeInfoBean.setMobile(rs.getLong("mobile"));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
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


		}
		return employeeInfoBean;
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;


		EmployeeInfoBean employeeInfoBean = null;
		try
		{

			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db", "root", "root");

			String query = "select * from employee_info where emp_id = ? and password = ?" ;
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);
			pstmt.setString(2, password);

			rs = pstmt.executeQuery();

			if(rs.next()) {
				employeeInfoBean = new EmployeeInfoBean();

				employeeInfoBean.setEmpId(rs.getInt("emp_id"));
				employeeInfoBean.setEmpName(rs.getString("emp_name"));
				employeeInfoBean.setAge(rs.getInt("age"));
				employeeInfoBean.setSalary(rs.getDouble("salary"));
				employeeInfoBean.setDesignation(rs.getString("designation"));
				employeeInfoBean.setMobile(rs.getLong("mobile"));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
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


		}
		return employeeInfoBean;
	}

	public boolean deleteEmployee(int empId) {
		
		Connection con = null; 
		PreparedStatement pstmt = null;

		boolean isDeleted = false;
		
		try {

			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/elf_employee_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");

			String query = "delete from employee_info where emp_id= ?";

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,  empId);

			int n = pstmt.executeUpdate();

			if(n>0) {
				isDeleted = true;
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {

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
		}
		return isDeleted;
		
	}

	@Override
	public boolean updateEmployee(int empId, long mobile) {
		
		Connection con= null;
		PreparedStatement pstmt = null;

		boolean isUpdated = false;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db", "root", "root");

			String query = "update employee_info set mobile = ? where emp_id = ?";

			pstmt = con.prepareStatement(query);
			
			pstmt.setLong(1,  mobile);
			pstmt.setInt(2, empId);
			
			int n = pstmt.executeUpdate();

			if(n>0) {
				isUpdated = true;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {

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
	}
		return isUpdated;
	}
}