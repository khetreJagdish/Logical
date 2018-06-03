package com.lara;

import java.util.Arrays;

// write a java program to find second largest element in the array in the java

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] array = {5,8,1,6,3,10,25,65,45};
		
		secondHighestNumber(array);
		
		
	}

	private static void secondHighestNumber(int[] array) {
		
		Arrays.sort(array);
		System.out.print("Sorted Array : " );
		for (int i : array) {
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("Third Highest Number in an Array : "+array[array.length-3]);
		
	}

}
