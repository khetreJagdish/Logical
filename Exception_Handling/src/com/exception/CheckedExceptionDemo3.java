package com.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.exception.B.T;

public class CheckedExceptionDemo3
{
	//A a = new A();                                                                          We can't create Object of abstract class
	B b = new B();
	T t = new T(){};
	Y y = new Y(){};
	public static void main(String[] args)
	{
		
		try
		{
			System.out.println(10/0);
		
		}
		catch (ArithmeticException e)
		{
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	
	}
}


 abstract class A
{
	 
}
 
 final class B
 {
	 public static void hello()
	{
		System.out.println("Hello from final class");
	}
	 
	 public static void name()
	{
		hello();
	}
	 
	 interface T
	 {
		 
	 }
	 
 }
 
 interface Y
 {
	 
 }