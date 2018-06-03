package com.lara;

public class Student implements Runnable{
		
	@Override
	public void run() {
			
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			start();
		}
		
	}
	
	public void start() {
		
		System.out.println("From start() method : "+Thread.currentThread().getName());
		
	}
	
}
