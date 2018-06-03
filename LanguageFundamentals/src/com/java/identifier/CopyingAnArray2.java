
package com.java.identifier;

public class CopyingAnArray2 {

	public static void main(String[] args) {
			
		int[] a = {10,20,30,40,50,60};
		int[] b = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		a[2] = 5;
		System.out.println(a[2]);  // 2           //Changing value of 3rd element in array 'a'
		System.out.println(b[2]); // 30       // //value of 3rd element in array 'b' will not change
	}
}

