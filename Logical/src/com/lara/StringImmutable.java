package com.lara;

public class StringImmutable {
	
	public static void main(String[] args) {
		
		String s1 = "JAVA";
		String s2="JAVA";


		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		s1 = s1+ "J2EE";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	
	
	String str1 = new String("JAVA");
	System.out.println(str1);
    str1.concat(s2);
	System.out.println(str1);
	}
}
