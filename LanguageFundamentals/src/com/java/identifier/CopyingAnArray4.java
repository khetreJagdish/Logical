package com.java.identifier;

public class CopyingAnArray4 {
		
	public static void main(String[] args) {
			int[] a = {10, 20, 30, 40, 50, 60};
			int[] b = a.clone();
			
			for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
			}
			
			a[0]= 14;   //Changing value of 1st element in array 'a'
			System.out.println("Value of b[0] = " + b[0]);    // //value of 1st element in array 'b' will not change
	}
}
