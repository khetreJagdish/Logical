package com.multithreading;



class MyThread extends Thread  
{

	@Override
	public void run()
	{
		
		for (int i = 0; i < 10; i++)
		{
			
			System.out.println("Child Thread");
		}
	}
	
	
	
}

public class ThreadDemo
{
	public static void main(String[] args)
	{
		MyThread myThread = new MyThread();
		myThread.start();
			System.out.println(myThread.MAX_PRIORITY);
//		for (int i = 0; i < 10; i++)
//		{
//			System.out.println("Main Thread");
//			
//		}
	}

}
