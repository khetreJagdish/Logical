package com.lara;

import java.util.HashSet;
import java.util.Set;

public class CheckDuplicatesInJavaArray {

	public static void main(String[] args) {
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby",  "JavaScript" }; 
		System.out.println("Checking array with duplicate using brute force: " );
		String[] returnArray = findDuplicateElement(names);
		
		for (String string : returnArray) {
			if (string == null) {
				System.out.print(" ");
			}
			System.out.println(string);
		}

	}
	
	


	private static String[] findDuplicateElement(String[] array) 
	{
		String[] str = new String[6];
		for (int i = 0; i < array.length; i++)
		{

			for (int j = i+1; j < array.length; j++)
			{

				if (array[i].equals(array[j]) ) 
				{
					str[i] = array[i];
			
				}
			}
		}
		return str;
	}
	
	public static boolean checkDuplicateUsingSet(String[] input)
	{
		Set tempSet = new HashSet<>();
		
		for (String str :input) {
			if (tempSet.add(str)) {
				return true;
			}
		}
		return false;
		
	}

}
