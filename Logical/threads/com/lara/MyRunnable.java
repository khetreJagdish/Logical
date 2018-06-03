package com.lara;

class MyTask implements Runnable
{
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("From "+ Thread.currentThread().getName());
		}
	}
}
public class MyRunnable {
		
	public static void main(String[] args) {
		MyTask t = new MyTask();
		Thread t1 = new Thread(t);
		t1.setName("Runnable");
		t1.start();;
		for (int i = 0; i < 10; i++) {
			System.out.println("From "+ Thread.currentThread().getName());
		}
	}
}
