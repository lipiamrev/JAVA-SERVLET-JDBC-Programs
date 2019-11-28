package com.manthan.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestF {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(14);
		al.add(19);
		al.add(12);
		
		System.out.println(al);
		
		Predicate<Integer> ps = i -> i%2 != 0;
		
		//System.out.println(ps);
	}

}
