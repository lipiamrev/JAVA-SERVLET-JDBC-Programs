package com.manthan.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestG {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(14);
		al.add(19);
		al.add(12);
		
		
		Predicate<Integer> ps = i -> i%2 != 0;
		
		List<Integer> bl = al.stream().filter(ps).collect(Collectors.toList());
		
//		for(Integer r : al) {
//			if(ps.test(r)) {
//				bl.add(r);
//			}
//		}
		System.out.println(bl);
	}

}
