package com.manthan.thread.test;

public class User extends Thread {

	PVR i;
	
	User(PVR ref) {
		this.i = ref;
		}
	
	public void run() {
		i.confirm();
	}

}
