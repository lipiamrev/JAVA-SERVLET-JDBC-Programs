package com.manthan.emp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {

	public static void main(String[] args) {

		Connection con = null; 
		PreparedStatement pstmt = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id to delete: ");
		int emp_id = sc.nextInt();

		try {

			Class.forName("com.mysql.jdbc.Driver");

			String dbUrl = "jdbc:mysql://localhost:3306/elf_employee_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");

			String query = "delete from employee_info where emp_id= ?";

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,  emp_id);

			int n = pstmt.executeUpdate();

			if(n>0) {
				System.out.println("Record deleted");
			}
			else {
				System.out.println("Record not deleted");
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
	}
}
