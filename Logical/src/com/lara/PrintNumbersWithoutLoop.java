package com.lara;

public class PrintNumbersWithoutLoop {
		
	static int i ;
	public static  void printNumber() {
		
		
		if (i < 100) {
			i++;
			System.out.println(i);
			printNumber();
		}
		
	}
	
	
	public static void main(String[] args) {
		PrintNumbersWithoutLoop  prLoop  = new  PrintNumbersWithoutLoop();
		prLoop.printNumber();
	}
}
