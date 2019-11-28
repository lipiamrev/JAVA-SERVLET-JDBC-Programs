package com.manthan.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestA {

		public static void main(String[] args) {
			
			String msg = "Hii";
			
			byte[] by = msg.getBytes();
			
		
				try(FileOutputStream fos =new FileOutputStream("lipi.txt")) {
					
					fos.write(by);
					
					System.out.println("done");
					
					
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
		
		}
}
