package com.manthan.array.test;

public class ReverseString {
public static void main(String[] args) {
	
	String name = "sam";
	
	char[] a = name.toCharArray();
	
	//for (int i = a.length-1; i >=0; i--) {
		//System.out.println(a[i]);
	//}
	
	for(char b : a) {
		System.out.println(b);
	}
}
}
