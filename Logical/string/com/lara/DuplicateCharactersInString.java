package com.lara;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
			
		duplicateCharCount("JavaJ2EEHelloJava");

	}

	private static void duplicateCharCount(String inputString) {
		
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		
		char[] charArray = inputString.toCharArray();
		
		for (char c : charArray) {
			
			if (charCountMap.containsKey(c)) 
			{
				charCountMap.put(c, charCountMap.get(c)+1);
				
			} 
			else 
			{
				charCountMap.put(c,1);
			}
			
		}
		
		
		Set<Character> repeatedChar = charCountMap.keySet();
		
		for (Character character : repeatedChar) {
			if (charCountMap.get(character) > 1)
			{
				System.out.println(character + " : " + charCountMap.get(character));
			}
			
		}
	}

}
