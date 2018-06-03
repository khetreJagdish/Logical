package com.lara;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class WordLineCharCountInFile {

	public static void main(String[] args) {
		
		BufferedReader bufferedReader = null;
		
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		
		try {
			//creating buffer Object
			bufferedReader = new BufferedReader(new FileReader("‪C:/Users/JK/Desktop/StockTrade.txt"));
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Word : ");
			String str  = sc.nextLine();
			int i = str.length();
			System.out.println("Length : "+i);
			String currentLine = bufferedReader.readLine();
			
			while (currentLine != null) {
				//Updating Line Count
				lineCount++;
				
				//Getting number of words in currentline 
				String[] words = currentLine.split(" ");
				
				//updating the wordcount 
				
				//wordCount = wordCount + words;
				
				for (String word : words) {
					
					charCount = charCount + words.length;
					
				}
				
			}
		} 
		catch (Exception e) {
		
		}
	}
}
