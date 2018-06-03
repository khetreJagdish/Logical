package com.lara;

import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		
		String firstString ;
		String secondString ;
		int len, len1,len2, found = 0, not_found=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First  String :");
		firstString = scanner.nextLine();
		
		System.out.println("Enter the Second  String :");
		secondString = scanner.nextLine();
		
		len1 = firstString.length();
		len2 = secondString.length();
		
		if (len1 == len2) {
				len = len1;
				for (int i = 0; i < len; i++) {
					
					found = 0;
					for (int j = 0; j < len; j++) {
						
						if (firstString.charAt(i) == secondString.charAt(j)) {
							found = 1;
							break;
						}
					}
					
					if (found == 0) {
						
						not_found = 1;
						break;
					}
					
					if (not_found == 1) {
						System.out.println("Strirngs are not anagrams to each others");
						
					} 
					else
					{
						System.out.println("Strings are anagrams");	
						break;
					}
				}
			
			
		}
		else {
			System.out.println("To be an Anagram String , length should be equal");
		}
		
	}
}
