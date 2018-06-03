package com.lara;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		System.out.println(larestNumberThanN(123,2));
		System.out.println(larestNumberThanN(55422,4));
	}

	 static int larestNumberThanN(int number, int digit) {
		
		 char c = Integer.toString(digit).charAt(0);
		
		 for (int i = number; i > 0; --i) {
			
			 if (Integer.toString(i).indexOf(c) == -1) {
				
				 return i;
			}
			 
		}
		 return -1;
	}
}
