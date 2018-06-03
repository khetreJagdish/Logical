

package com.java.identifier;

import java.util.Arrays;

public class SeparateZerosFromNonZeros1 {
			
				static void separateZerosFromNonZeros(int[] inputArray) // {10,5,0,7,0,6}
				{
					int counter=inputArray.length-1;
					
					for (int i = inputArray.length-1; i >0; i--) {
						
							if (inputArray[i] != 0) {
								  inputArray[counter] = inputArray[i];
								  counter--;
							}
					}
					
					while (counter >= 0) {
								inputArray[counter] = 0;
								counter--;
					}
					System.out.println(Arrays.toString(inputArray));
				}
	public static void main(String[] args) {
			
		separateZerosFromNonZeros(new int[] {10,5,0,7,0,6});
		separateZerosFromNonZeros(new int[] {10, 5, 14, 3, 8, 0, 0, 0});
		separateZerosFromNonZeros(new int[] {10, 5, 2, 7, 9, 0, 0, 0});
	}

}
