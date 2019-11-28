package com.manthan.array.test;

public class TestB {
public static void main(String[] args) {
	
	Student[] s = new Student[4];
	
	Student s1 = new Student("sam",01,78.0);
	Student s2 = new Student("samm",02,78.1);
	Student s3 = new Student("sammm",03,78.50);
	Student s4 = new Student("sammmm",04,78.60);
	
	s[0]=s1;
	s[1]=s2;
	s[2]=s3;
	s[3]=s4;
	
	for(Student r : s) {
		System.out.println(r.name);
		System.out.println(r.id);
		System.out.println(r.percentage);
	}
	
}
}
