package com.manthan.lambda;

import java.util.function.Supplier;

public class TestE {
	public static void main(String[] args) {
		
		Supplier<Student> sup = () -> new Student("kim", 44, 45.36);
		
		Student s =sup.get();
		
		System.out.println("name:"+s.name);
		System.out.println("age:"+s.age);
		System.out.println("percentage:"+s.percentage);
	}

}
