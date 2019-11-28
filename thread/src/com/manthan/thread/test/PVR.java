package com.manthan.thread.test;

public class PVR extends Thread {

	synchronized void confirm()
	{
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
