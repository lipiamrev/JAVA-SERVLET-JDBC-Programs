package com.manthan.lambda;

import java.util.function.Function;

public class TestC {
	public static void main(String[] args) {
		
		Student st = new Student ("priya", 22, 45.67);
		
		Function<Student, Student> fn = x -> {
			
			st.percentage = st.percentage + 4 ;
			return st;
		};
		
		Student t = fn.apply(st);
		System.out.println(t.percentage);
				
	}

}
