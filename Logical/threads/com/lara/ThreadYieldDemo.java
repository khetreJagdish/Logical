package com.lara;

class YieldDemo extends Thread
{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread With Priority : " + Thread.currentThread().getPriority());
			Thread.yield();
		}
	}
}
public class ThreadYieldDemo {
			
		public static void main(String[] args) {
			YieldDemo yd = new YieldDemo();
			yd.setPriority(5);
			yd.start();
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Main Thread With Priority : " + Thread.currentThread().getPriority());
			}
			
		}
}
