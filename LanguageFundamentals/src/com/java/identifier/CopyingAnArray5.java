

package com.java.identifier;

public class CopyingAnArray5 {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60};
		int[] b = new int[a.length];
		
		System.arraycopy(a,0, b, 0, a.length);
		 int[] c = new int[-5]; // Runtime Exception : NegativeArraySizeException
		System.out.println(b[0]);
		for (int i = 0; i < b.length; i++) {
			
			System.out.println("b[" +i + "] = " + b[i]);
		}
	}
}
