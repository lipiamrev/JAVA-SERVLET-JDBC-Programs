package com.manthan.files;

import java.io.FileWriter;
import java.io.IOException;

public class TestB {
	public static void main(String[] args) {
		
		String msg = "Good Morning";
		
		char[] ch = msg.toCharArray();
		
		try(FileWriter fw = new FileWriter("gm.txt");) {
			
			fw.write(ch);
			
			System.out.println("done");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
