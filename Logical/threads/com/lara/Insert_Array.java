package com.lara;

import java.util.Scanner;

public class Insert_Array {
	
	public static void main(String[] args) {
		
		int n, pos,element;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number of Elements you want in array :  ");
		n = sc.nextInt();
		
		int[] array = new int[n+1];
		
		System.out.println("Enter all the Elements ");
		
		for (int i = 0; i < n; i++) 
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the position where you want to insert");
		pos = sc.nextInt();
		
		System.out.println("Enter the Element you want to insert");
		element = sc.nextInt();
		
		 for(int i = (n-1); i >= (pos-1); i--)
	        {
	            array[i+1] = array[i];
	        }
	        array[pos-1] = element;
	        System.out.print("After inserting:");
	        for(int i = 0; i < n; i++)
	        {
	            System.out.print(array[i]+",");
	        }
	        System.out.print(array[n]);
	}
}
