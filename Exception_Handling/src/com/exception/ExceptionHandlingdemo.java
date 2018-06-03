package com.exception;

import java.io.IOException;

public class ExceptionHandlingdemo
{
	public static void main(String[] args)
	{
		try
		{
			Thread.sleep(1000);
			System.out.println("Frm try");
		} catch (Exception e)
		{
			System.out.println("hello");
		}
		
	}
}
