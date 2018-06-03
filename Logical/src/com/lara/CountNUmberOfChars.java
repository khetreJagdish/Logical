package com.lara;

import java.util.Scanner;

public class CountNUmberOfChars {

	public static void main(String[] args) {
		String str =" ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		System.out.println("Enter the Character");
		String ch =sc.nextLine();
		
		int charCount = str.length() - str.replaceAll("a","").length();
		System.out.println("Number of character count " +charCount);
	}
}
