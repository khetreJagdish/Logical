package com.lara;

import java.util.HashMap;

public class EachCharCountInString {

	static void charactercount(String inputString)
	{
		HashMap<Character, Integer>  charCountMap = new HashMap<>();
		char[] charArr = inputString.toCharArray();
		for (char c : charArr) 
		{	
			if (charCountMap.containsKey(c)) 
			{	
				  charCountMap.put(c, charCountMap.get(c)+1);	
			}
			else 
			{
				charCountMap.put(c, 1);
			}
		}
		
		System.out.println(charCountMap);
	}
	public static void main(String[] args) {

			charactercount("String");
			charactercount(" JAVA CONCEPT OF THE DAY");
		
	}
}
