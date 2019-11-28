package com.manthan.emp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class JDBC2 {
	

		public static void main(String[] args) {

			Connection con = null;
			
			PreparedStatement pstmt = null;
			
			ResultSet rs = null;
			
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter Employee id: ");
			int empid = sc.nextInt();
			
			try
			{
				//Load the Driver
				Class.forName("com.mysql.jdbc.Driver");
				
				//get the connection via driver
				String dbUrl = "jdbc:mysql://localhost:3306/elf_employee_db";
				con = DriverManager.getConnection(dbUrl, "root", "root");
				
						
				//issue sql Query
				String query = "select * from employee_info where emp_id = ?";
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, empid);
				
				rs = pstmt.executeQuery();
				
				//Process the result
				if(rs.next()) {
					System.out.println("Employee id is found..");
					System.out.println("Name = " +rs.getString("emp_name"));
					System.out.println("Age = " + rs.getInt("age"));
				}
				else {
					System.out.println("Employee id is not found");
				}
			}
			
			catch (Exception e){
					e.printStackTrace();
				}
			
			finally {
					
					//close all objects
					
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
					
				
				}//end of try-catch-finally
				
	}//End of Main

	}//End of Class



