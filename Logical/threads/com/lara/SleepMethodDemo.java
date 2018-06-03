package com.lara;

public class SleepMethodDemo {

	public static void main(String[] args) throws InterruptedException
	{
			
		for (int i = 0; i < 10; i++) {
			System.out.println("Numbers : " + i);
			Thread.sleep(5000);
		}
	}

}
