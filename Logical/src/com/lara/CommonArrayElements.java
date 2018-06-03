package com.lara;

import java.util.Arrays;
import java.util.HashSet;

public class CommonArrayElements {
	public static void main(String[] args) {
		
		String[] s1 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		 
        String[] s2 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		HashSet< String> set = new HashSet<>();
		
		for (int i = 0; i < s1.length; i++) {
			
			for (int j = 0; j < s2.length; j++) {
				
				if (s1[i].equals(s2[j])) {
					
					set.add(s1[i]);
				}
			}
		}
		System.out.println(set);
		
		
		System.out.println("Using retainAll() Method");
		
		Integer[]  s12 = {1, 5, 8 , 9 , 7 , 3};
		Integer[]  s13 = {1, 6, 2 , 9 , 4 , 10};
		
		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(s12));
		HashSet<Integer> set2 = new HashSet<>(Arrays.asList(s13));
		
		set1.retainAll(set2);
		
		System.out.println(set1);
	}
	
	
	
	
}
