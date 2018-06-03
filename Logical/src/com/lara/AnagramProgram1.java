package com.lara;

//Anagram Program In Java Using Iterative Method

public class AnagramProgram1 {
		
	public static void isAnagram(String word) {
		
		String s1 = word.replaceAll("\\s", "");
		String s2 = word.replaceAll("\\s", "");
		boolean flag = true;
		if (s1.length() != s2.length()) {
			flag = false;
		}
		
		else
		{
			
		}
		
		if (flag)
		{
			System.out.println("String is Anagram");
		} else {

		}
	}
		public static void main(String[] args) {
			
				
		}
}
