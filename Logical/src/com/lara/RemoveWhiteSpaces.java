package com.lara;

public class RemoveWhiteSpaces {
		
	public static void main(String[] args) {
		
		String str = "       JAVA CONCEPT   OF   THE   DAY                               jdbc  Structs";
		
		//1. Using replaceAll() Method
		
		System.out.println("Before Removing of White Spaces : " + str);
		String afterRemoveWhiteSpaces = str.replaceAll("\\s", "");
		System.out.println("After Removing of White Spaces "+afterRemoveWhiteSpaces);
		
		//2. Without Using replaceAll() method
		
		char[] strArray = str.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < strArray.length; i++) {
			
			if ((strArray[i] != ' ' )  &&  (strArray[i] !='\t')) {
				
				sb.append(strArray[i]);
			}
		}
		System.out.println("After Removing of White Spaces without Using replaceAll() Method " + sb);
	}
}
