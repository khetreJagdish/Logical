package com.lara;

public class StringEqualsMethod {
	
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1==s2);    //  true 
		System.out.println(s1.equals(s2));// true
		
		String s3 = new String(s1);
		String s4 = new String(s2);
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		
	}
}
