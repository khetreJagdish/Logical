package com.lara;

import java.util.Scanner;

public class FactorialNumber {	
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Number ");
			int number = sc.nextInt();
			
			for (int i =(number-1); i >1; i--) 
			{
				
				number = number*i;
				
			}
			System.out.println("Factoraial of A number =  "+number+" ");
			
		}
}
