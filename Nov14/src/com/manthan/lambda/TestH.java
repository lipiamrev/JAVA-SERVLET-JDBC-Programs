package com.manthan.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestH {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(15);
		al.add(14);
		al.add(19);
		al.add(12);
		
		Function<Integer, Integer> fn = i -> i * 10;
		
		List<Integer> bl =al.stream().map(fn).collect(Collectors.toList());
		
		System.out.println(bl);
	}
}
 