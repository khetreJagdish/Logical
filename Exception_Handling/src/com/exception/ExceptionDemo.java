package com.exception;

public class ExceptionDemo
{
	public static void main(String[] args) 
	{
		doStuff();
	}

	private static void doStuff() 
	{
		try
		{
			doMoreStuff();
		} catch (Exception e)
		{
			// TODO: handle exception
		}
		
		
	}

	private static void doMoreStuff() throws InterruptedException 
	{
		
			Thread.sleep(1000);
		
		
		
	}
}
