package com.lara;

import java.util.Arrays;
import java.util.BitSet;

public class MissingMultipleNumbersInAnArray {

	public static void main(String[] args) {
		printMissingNumbers(new int[] {1,2,3,4,9,8} , 10);
		printMissingNumbers(new int[] {1,2,3,4,6} , 6);

	}

	private static void printMissingNumbers(int[] array, int expectedNumCount) {
		
		int missingNumCount = expectedNumCount - array.length;
		BitSet bitSet = new BitSet(missingNumCount);
		
		for (int i : array) 
		{
			System.out.printf("i value %d",i);
			System.out.println();
			bitSet.set(i-1);
		}
		System.out.printf("Missing Number in array %s, with toalCount %d is ", Arrays.toString(array), expectedNumCount);
		
		int lastMissingIndex = 0;
		
		for (int i = 0; i < missingNumCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println();
			System.out.println(++lastMissingIndex);
		}
	}

}
