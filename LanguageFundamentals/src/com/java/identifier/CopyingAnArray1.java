package com.java.identifier;

public class CopyingAnArray1{
	
	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50};
		int[] b = a;
		
		for (int i = 0; i < b.length; i++) {
			
			System.out.print(b[i] + "  ");
		}
		System.out.println();
		a[2] = 90;
		System.out.println(a[2]);
		System.out.println(b[2]);
		b[3]= 5;
		System.out.println(b[3]);
		System.out.println(a[3]);
	}
	
	
	
}
