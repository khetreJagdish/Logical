package com.exception;

public class ExceptionInInitializerErrorDemo
{
	//static int x = 10/0;
	
	static{
		String s = null;
		System.out.println(s.length());
	}
	public static void main(String[] args)
	{
		
		
	}
}
