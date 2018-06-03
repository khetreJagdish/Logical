package com.lara;

class SubClass implements Runnable
{
	@Override
	public void run() {
		System.out.println("From Run");
		
	}
}
public class MyThread1 {
	
	public static void main(String[] args) {
		Thread t1 = new Thread();
		t1.run();
	}
}
