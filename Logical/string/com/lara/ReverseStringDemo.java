package com.lara;

public class ReverseStringDemo {

	public static void main(String[] args) {
			
			reverseString("Java");
		
	}

	private static void reverseString(String string) {
		
		char[] input = string.toCharArray();
		
		for (int i = input.length-1; i >= 0; i--) {
			System.out.print(input[i]); 
		}
		
	}

}
