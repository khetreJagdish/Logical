package com.lara;

public class ThreadTest1 {
		
	public static void main(String[] args) {
		
		MyThreadDemo myThreadDemo2 = new MyThreadDemo("thread 2 : ");
		MyThreadDemo myThreadDemo1 = new MyThreadDemo("thread 1 : ");
		
		myThreadDemo2.start();
		myThreadDemo1.start();
		
		boolean thread1IsAllive = true;
		boolean thread2IsAllive = true;
		
		System.out.println("myThreadDemo1.isAlive() : " + myThreadDemo1.isAlive());
		System.out.println("myThreadDemo2.isAlive() : " + myThreadDemo2.isAlive());
		
		do {
				
			if (thread1IsAllive && !myThreadDemo1.isAlive()) 
			{
	               thread1IsAllive = false;
	               System.out.println("Thread 1 is dead.");
	           }
	           if (thread2IsAllive && !myThreadDemo1.isAlive())
	           {
	               thread2IsAllive = false;
	               System.out.println("Thread 2 is dead.");
	           }
				
		} while (thread2IsAllive || thread1IsAllive);
	}
}
