package com.manthan.lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class TestI {
public static void main(String[] args) {
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(10);
	al.add(15);
	al.add(14);
	al.add(19);
	al.add(12);
	
	Comparator<Integer> c = (i,j) -> i.compareTo(j);
	
	Integer x = al.stream().max(c).get();
	
	Integer y = al.stream().min(c).get();
	
	System.out.println(x);
	
	System.out.println(y);
}
}
