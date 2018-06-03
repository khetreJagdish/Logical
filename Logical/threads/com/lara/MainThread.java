package com.lara;
class MyThread implements Runnable
{
	@Override
	public void run() {
		
		System.out.println("From Default Run Method");
	}

public void run(String name) {
		
	System.out.println("From Default Run Method" + name);
	}
}
public class MainThread {
	
	public static void main(String[] args) {
		MyThread t3 = new MyThread();
		Thread  t1 = new Thread(t3);
		Thread  t4 = new Thread(t3);
		Thread  t5 = new Thread(t3);
		Thread t6 = new Thread(new Student());
		
		t1.start();
		t4.start();
		t5.start();
		t5.run();
		t6.start();
		t3.run("SubRun");
		t1.setName("Main Thread");
		System.out.println("Name of thread is : "+ t1);
	}
}
