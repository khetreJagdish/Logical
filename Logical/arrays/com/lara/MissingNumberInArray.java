package com.lara;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
			int[] array = {1,2,3,5,6};
			int missingNumber = getMissingNumber(array, 6);
			System.out.printf("Missing Number in an Array %s is %d", Arrays.toString(array), missingNumber);
	}

	private static int getMissingNumber(int[] array, int n) {
			int expectedTotal = (n*(n+1)/2);
			int actualNumber = 0;
			for (int i : array) {
				 actualNumber = actualNumber +i;
			}
		return expectedTotal - actualNumber;
	}

}
