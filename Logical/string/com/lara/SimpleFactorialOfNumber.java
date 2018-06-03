package com.lara;

public class SimpleFactorialOfNumber {

	public static void main(String[] args) {
		
		findFactorial(5);
	}

	static void findFactorial(int number)
	{
		int fact = 1;
	  int temp = number;
	 for(int i = 1; i <= temp; i++)
	 {
		fact = fact * i;
		System.out.println(fact);
	 }                    
	 System.out.println("Factorial of a Number is :   " + fact);
	}

}
