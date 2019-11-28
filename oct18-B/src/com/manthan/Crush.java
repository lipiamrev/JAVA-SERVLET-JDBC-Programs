package com.manthan;

public class Crush {

	void recieve(Phone p) {
		
		if (p instanceof Mi) {
			System.out.println("brother");
		}
		
		else if ( p instanceof Pixel) {
			
			System.out.println("dear");
		}
		
		
		else if (p instanceof Iphone) {
			System.out.println("ilu");			
		}
		else
		{
			System.out.println("non sense");
		}
		
	}
	
}
