package com.java.identifier;
// copyOf(int[] , int size) method to copy an one Array to another Array
import java.util.Arrays;

public class CopyingAnArray3 {
	public static void main(String[] args) {
		
		int[] a = {10, 20, 30, 40 , 50, 60};
		int[] b= Arrays.copyOf(a, a.length);
		
		for (int i = 0; i < b.length; i++) {
				System.out.println(b[i]);
		}
		
		a[0]= 11;
		System.out.println("Value of : b[0] =  "+ b[0]);
		System.out.println("Value of : a[0] =  " + a[0]);
	}
}
