package com.exception;

public class ExceptionDemo2
{
	
	public static void main(String[] args) throws Exception
	{
		doStuff();
		System.out.println(10/0);
	}

	public static void doStuff()
	{
		doMoreStuff();
		System.out.println("Hi");
		
	}

	public static void doMoreStuff()
	{
		System.out.println("Hello");
		
	}
	
	
}
