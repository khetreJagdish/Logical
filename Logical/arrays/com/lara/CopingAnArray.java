/**
 * 
 */
package com.lara;

/**
 * @author JK
 *
 */
public class CopingAnArray {
		public static void main(String[] args) {
			
			int[] a = {12,4, 7 , 8 , 6 , 3 };
			int[] b = a;
			
			for (int i = 0; i < b.length; i++) {
				
				System.out.print(" "+a[i]);
			}
			
			a[2] = 56;
			System.out.println();
			System.out.println(b[2]);
			b[4] = 100;
			System.out.println(a[4]);
			
	for (int i = 0; i < a.length; i++) {
				
				System.out.print(" "+a[i]);
			}
			
		}
}
