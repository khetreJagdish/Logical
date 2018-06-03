
//Java Program To Find Duplicate Elements In An Array Using Brute Force Method
package com.lara;

public class DuplicatesInArray2 {
	
	public static void main(String[] args) {
		
			String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
			
			for (int i = 0; i <= strArray.length-1; i++) {
				
				for (int j = i+1; j < strArray.length; j++) {
							if ((strArray[i].equals(strArray[j]))  ) {
								
								System.out.println("Duplicates Array Elements  : " +strArray[j]);
							}
				}
			}
	}
}
