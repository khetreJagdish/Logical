package com.lara;

import java.math.BigInteger;


// Java program that uses BigInteger to compute Factorial.

public class FactorialOfNumber {

	public static void main(String[] args) {
		int number = 20;
		System.out.println(factrial(number));
	}

	private static BigInteger factrial(int number) {
		
		BigInteger f = BigInteger.ONE;
		
		for (int i = 2; i <= number; i++) {
			f = f.multiply(BigInteger.valueOf(i));
			
		}
		return f;
	}

}
