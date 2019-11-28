package com.manthan.emp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class MyFirstJDBCProgram {

	public static void main(String[] args) {

		Connection con = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try
		{
			//Load the Driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			//get the connection via driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");
			
					
			//issue sql Query
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employee_info");
			
			//Process the result
			while(rs.next()) {
				int  empId = rs.getInt("emp_id");
				String name = rs.getString("emp_name");
				int age = rs.getInt("age");
				double salary = rs.getDouble("salary");
				String designation = rs.getString("designation");
				long mobile = rs.getLong("mobile");
				
				System.out.println("ID  =  " + empId);
				System.out.println("Name  =  " + name);
				System.out.println("Age  =  " + age);
				System.out.println("Salary  =  " + salary);
				System.out.println("Mobile  =  " + mobile);
				System.out.println("Designation  =  " + designation);
				System.out.println("-------------------------------------");
			}
			}catch (Exception e){
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
					if (stmt != null) {
						try {
							stmt.close();
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
