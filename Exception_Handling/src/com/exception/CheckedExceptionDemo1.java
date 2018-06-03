package com.exception;

import java.io.IOException;
import java.rmi.ServerError;

public class CheckedExceptionDemo1
{
	public static void main(String[] args)
	{
		try
		{
			
			System.out.println(10/0);
		} 
		catch(NumberFormatException nException)
		{
			System.out.println(nException);
		}
		catch (Exception e) {
			System.out.println(e);
			System.exit(0);
		}
		catch (Throwable e)
		{
			System.out.println(e);
		}
	}

	private static void hello()
	{
		
		System.out.println("Hello");
		
	}
}
