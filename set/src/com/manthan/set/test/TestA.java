package com.manthan.set.test;

import java.util.TreeSet;

public class TestA {
	public static void main(String[] args) {
		
		StudentById x =new StudentById();
		
		StudentByPercentage hh = new StudentByPercentage();
		
		TreeSet<Student> ts = new TreeSet<Student>(x);

		Student s1 = new Student(1, "s", 78.2);
		Student s2 = new Student(2, "sa", 56.98);
		Student s3 = new Student(3, "se", 48.12);
		Student s4 = new Student(4, "so", 32.15);

		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);

		for (Student stu : ts) {
			System.out.println(stu.id);
			System.out.println(stu.name);
			System.out.println(stu.percentage);
		}                                                                    
		
		TreeSet<Student> ts1 = new TreeSet<Student>(hh);

//		Student s1 = new Student(1, "s", 78.2);
//		Student s2 = new Student(2, "sa", 56.98);
//		Student s3 = new Student(3, "se", 48.12);
//		Student s4 = new Student(4, "so", 32.15);

		ts1.add(s1);
		ts1.add(s2);
		ts1.add(s3);
		ts1.add(s4);

		for (Student stu : ts1) {
			System.out.println(stu.id);
			System.out.println(stu.name);
			System.out.println(stu.percentage);
		}
	}
}
