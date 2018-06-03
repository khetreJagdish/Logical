package com.exception;

/*
 * Default Exception Handler (Part of JVM)
 * 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.exception.ExceptionDemo1.m1(ExceptionDemo1.java:17)
	at com.exception.ExceptionDemo1.m2(ExceptionDemo1.java:13)
	at com.exception.ExceptionDemo1.m3(ExceptionDemo1.java:9)
	at com.exception.ExceptionDemo1.main(ExceptionDemo1.java:23)
 * 
 * 
 * */


public class ExceptionDemo1
{
		public static void m3()
		{
			try
			{
				m2();
			} catch (Exception e)
			{
				System.out.println("ArithemeticException");
		
			}
		}
		public static void m2()
		{
			m1();
		}
		public static void m1()
		{
			System.out.println(10/0);
			
		}
		
		public static void main(String[] args)
		{
			m3();
			
		}
}
