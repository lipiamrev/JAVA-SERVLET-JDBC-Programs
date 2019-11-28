package com.manthan.thread.test;

public class TestB {
public static void main(String[] args) {
	
	System.out.println("Main Started");
	MyTask t1 = new MyTask();
	
	t1.start();
	
	System.out.println("Main ended");
	
}
}
