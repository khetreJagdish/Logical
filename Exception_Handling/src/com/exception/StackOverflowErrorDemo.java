package com.exception;

public class StackOverflowErrorDemo
{
	public static void main(String[] args)
	{
		try
		{
			String[] arr = {"Java", "C"};
			main(arr); 
		} catch (Throwable e)
		{
			System.out.println(e);
		}
	}
}