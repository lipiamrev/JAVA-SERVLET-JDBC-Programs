package com.manthan.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestD {
	public static void main(String[] args) {
		
		Properties pr = new Properties();
		
		pr.setProperty("driverName", "com.mysql.jdbcDriver");
		pr.setProperty("url", "jdbc:mysql://localhost:3306");
		pr.setProperty("user", "root");
		pr.setProperty("password", "root");
		
		try {
			FileOutputStream fout = new FileOutputStream("myDBconfig.properties");
			
			pr.store(fout,  "storing Data");
			
			System.out.println("done");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
