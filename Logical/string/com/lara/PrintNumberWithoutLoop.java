package com.lara;


//Write a Java Program to print numbers in java up to10 without using loops?

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		
		printNumbersWithoutLoop(1);

	}

	private static void printNumbersWithoutLoop(int number) {
		
		if(number <= 10)
		{
			System.out.println(number);
			printNumbersWithoutLoop(number+1);
		}
		
	}

}
