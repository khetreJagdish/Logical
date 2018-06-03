package com.lara;

class Thread2 extends Thread {
	
	
	int number;
	public Thread2(int number) {
		
		this.number = number;
	}
	@Override
	public void run() 
	{
			for (int i = number; i <= 100; i++) {
			
					if (i % 2 != 0) {
							System.out.println("Odd Numbers : "+i);
						}
			
			 synchronized (this) {
				
					
					try {
						wait(100);
					} catch (InterruptedException e) {
				
						e.printStackTrace();
					}
				
			}
		}
		
	}

}

class Thread1 extends Thread
{
	
	int number;
	public Thread1(int number) {
		
		this.number = number;
	}
	@Override
	public void run() {
		
		for (int i = number; i < 100; i++) {
			
			if (i % 2 == 0) {
				System.out.println("Even Numbers : "+i);
			}
			
			synchronized (this) {
				
					
					try {
						wait(100);
					} catch (InterruptedException e) {
				
						e.printStackTrace();
					}
				
			}
		}
	}
}

public class ThreadDemo
{
public static void main(String[] args) throws InterruptedException
{
		
		int number = 0;
		Thread1 t1 = new Thread1(number);
		Thread2 t2 = new Thread2(number);
		t1.start();
		t2.start();
		
		
	
	}
}