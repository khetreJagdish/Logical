package com.lara;

import java.util.HashSet;

public class DuplicatesInArray1 {
		public static void main(String[] args) {
			
			String[] strArray = {"abc", "def","mno", "def","xyz","pqr","pqr"};
			
			HashSet<String> set = new HashSet<>();
			
			for (String string : strArray) {
				if (set.add(string) == false) {
					System.out.print(" "+ string);
				}
			}
		}
}
