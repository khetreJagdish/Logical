package com.lara;

public class StringRotation {

	public static void main(String[] args) {
		
		
		String s1 = "JavaJ2eeStrutsHibernate";
		String s2 = "StrutsHibernateJavaJ2ee";
		
		if (s1.length() != s2.length()) 
		{	
			System.out.println("S1 is not Rotational String of S2");
		}
		else
		{
			String s3  = s1 + s2;
			System.out.println("String s3 : " + s3);
			if (s3.contains(s2)) 
			{
				System.out.println("s2 is rotated version of s1");
			}
			else 
			{
				System.out.println("s2 not is rotated version of s1");
			}
		}
	}
}
