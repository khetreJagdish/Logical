package com.lara;


// Java Program to Find the Count of Occurrences of Each Character in a String.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharOccurrencesInString {
	
		public static void main(String[] args) {
			String  string = null;
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in) );
			System.out.println("Enter the String"); // programming
			try {
				 string = bufferedReader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(string != null)
			{
					char[] ch = string.toCharArray();
					
					
					int charCount = 0;
					for (int i = 0; i < ch.length; i++) 
					{
						 charCount = 0;
						for (int  j = 0; j < ch.length; j++) 
						{
						
							if(ch[j] == ch[i])
							{
								charCount ++;
								
							} // end of if
							
						}// end of for
						
						System.out.println(ch[i]  + "  is found " + charCount + "times");
					}// end of for
					
			}
			
			
		
	}

}
