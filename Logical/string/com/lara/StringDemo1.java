package com.lara;


public class StringDemo1 
{
	public static void main(String[] args) 
	{
		StringBuffer sdf = new StringBuffer();
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.start();
		t2.start();
		String s1 = new String("sachin");
		s1 = s1.concat(" Tendulkar");
		System.out.println(s1);
	}
}
