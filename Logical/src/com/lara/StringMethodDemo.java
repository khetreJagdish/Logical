package com.lara;

public class StringMethodDemo {

	public static void main(String[] args) {
			
		String s = "Java Concept Of The Day";
		
		
		// getChars() Meethod
		
		char[] dest = new char[10];
		s.getChars(5, 11, dest, 0);
		
		for (char c : dest) {
			
			System.out.print(c);
		}
		
		char[] arr = s.toCharArray();
		// toCharArray() Method
		System.out.println();
		for (char c : arr) {
			System.out.print(c);
		}
		
		 String subString1 = s.substring(11);     
		 System.out.println();
	        System.out.println(subString1);   
	 
	        String subString2 = s.substring(5, 15);
	 
	        System.out.println(subString2); 

	}

}
