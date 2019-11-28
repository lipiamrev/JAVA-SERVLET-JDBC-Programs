package com.manthan.thread.test;

public class TestD {
public static void main(String[] args) {
	
	Pen p = new Pen();
	
	Thread t = new Thread(p);
	t.start();
}
}
