package com.exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedExceptionDemo
{
	
	public static void main(String[] args)
	{
		hello();
	}
	

	private static void hello()
	{
		System.out.println("Hello Java");
		demoMethod();
	}
	
	public static int demoMethod() 
	{
		String[] hello = null;
		System.out.println("statement 1");
		
		try
		{
			//hello();
			System.out.println(hello[0]);
			
			
		} catch (Exception e)
		{
			
			System.out.println(e.getMessage());
			
		}
		finally {
			System.out.println("From Finally");
			
		}
		System.out.println("Finish");
		return 1;
	}
	
}
