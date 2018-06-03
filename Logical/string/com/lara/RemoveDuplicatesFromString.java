package com.lara;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// How to remove the duplicates From String in java


public class RemoveDuplicatesFromString {

	public static void main(String[] args) throws Exception 
	{
	
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String inputString = bufferedReader.readLine();
		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			char[] ch = inputString.toCharArray();
			
			for (int j = i+1; j < ch.length; j++) {
				
				if (ch[j] == ch[i])
				{
				System.out.println(ch[j]);	
					count++;
					break;
				}
			}
	
		}
		

	}

}
