package com.java.identifier;


// How To Move Zeros To End Of An Array?

import java.util.Arrays;

public class SeparateZerosFromNonZeros {
	
		static void seperateZeroesFromNonZeroes(int[] inputarray)
		{
			int counter = 0;	
			for (int i = 0; i < inputarray.length; i++) 
			{
				   if(inputarray[i] != 0)
				   { 
					   inputarray[counter] = inputarray[i];  // 10 , 5 , 14,3,8 
					   counter++ ;  // 
				   }
			}
			
			while(counter < inputarray.length)
			{
				inputarray[counter] = 0;
				counter++;
			}
			System.out.println(Arrays.toString(inputarray));
		}
	public static void main(String[] args) {
			
		seperateZeroesFromNonZeroes(new int[] {10,5,0,14,3,0,8,0});
		seperateZeroesFromNonZeroes(new int[] {10,5,0,0,2,0,7,9});
	}

}
