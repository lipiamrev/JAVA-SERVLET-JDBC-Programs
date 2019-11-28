package com.manthan.lambda;

import java.util.function.Consumer;

public class TestD {
	public static void main(String[] args) {
		
		Student st = new Student("sam", 55, 89.5);
		
		Consumer<Student> c =
		s -> {
			System.out.println("name:" +s.name);
			System.out.println("age:" +s.age);
			System.out.println("percentage:" +s.percentage);
			
		};
		c.accept(st);
	
	}
}
