/**
 * 
 */
package com.lara;

/**
 * @author JK
 *
 */


public class ReplaceCharFromString {
	
static Boolean replaceChar(String str, char ch)
{
	int length = str.length();
	System.out.println(length);
	char charIn  = str.charAt(2);
	System.out.println(charIn);
	
	System.out.println((str +" ").length());
	String str2 ="()";
	char[] ch2 = new char[10];
	boolean b1 = str2.startsWith("(");
	boolean b2 = str2.endsWith(")");
	
	if (b1 == b2) {
		System.out.println("Equals");
	}
	//str2.getChars(1, 4, ch2, 1);
	System.out.println(ch2);
	boolean str1 = str.equals("Hello");
	return str1;
}

public static void main(String[] args) {
	
	System.out.println(replaceChar("Hello", 'H'));
}
}
