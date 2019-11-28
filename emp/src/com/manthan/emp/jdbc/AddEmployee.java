package com.manthan.emp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class AddEmployee {
	public static void main(String[] args) {
		
		Connection con = null;
		
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter emp id: ");
		int emp_id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name: ");
		String emp_name = sc.nextLine();
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		System.out.println("Enater salary: ");
		double salary = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter Designation: ");
		String designation = sc.nextLine();
		
		System.out.println("Enter mobile: ");
		long mobile = sc.nextLong();
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			String dbUrl = "jdbc:mysql://localhost:3306/elf_employee_db";
			con = DriverManager.getConnection(dbUrl, "root", "root");
			
			String query = "Insert into employee_info values (?, ?, ?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, emp_id);
			pstmt.setString(2, emp_name);
			pstmt.setInt(3, age);
			pstmt.setDouble(4, salary);
			pstmt.setString(5, designation);
			pstmt.setLong(6, mobile);
			
			int n = pstmt.executeUpdate();
			
			if(n>0) {
				System.out.println("Record inserted");
			}
			else {
				System.out.println("Record not inserted");
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
