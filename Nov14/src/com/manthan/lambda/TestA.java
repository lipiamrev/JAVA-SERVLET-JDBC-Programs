package com.manthan.lambda;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		
		
		Student st = new Student("divya", 22, 56.35);
		
				Predicate<Student> ps = s -> {
					if(s.percentage >= 35) {
						return true;
					}
					else {
						return false;
					}
				};
				
				boolean ans = ps.test(st);
				System.out.println("Result is " +ans);
}
}
