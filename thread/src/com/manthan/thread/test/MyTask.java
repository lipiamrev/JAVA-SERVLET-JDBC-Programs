package com.manthan.thread.test;

public class MyTask extends Thread {
 
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("running");
		}
	}
	
}
