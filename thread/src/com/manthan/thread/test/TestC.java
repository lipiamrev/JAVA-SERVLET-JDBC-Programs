package com.manthan.thread.test;

public class TestC {
	public static void main(String[] args) {
		
		PVR i =new PVR();
		User u =new User(i);
		u.start();
		
		User u1 = new User(i);
		u1.start();

	}
}
