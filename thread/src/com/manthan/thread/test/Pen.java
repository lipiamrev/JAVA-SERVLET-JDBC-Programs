package com.manthan.thread.test;

public class Pen implements Runnable{

	@Override
	public void run() {
		for (int i = 5; i >=1; i--) {
			System.out.println(i);
		}
	}
	
}
