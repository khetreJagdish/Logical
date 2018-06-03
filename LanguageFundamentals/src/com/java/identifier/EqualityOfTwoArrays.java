package com.java.identifier;

public class EqualityOfTwoArrays {
	
	public static void main(String[] args) {
		
		int[] a = {10,20,30,40,50};
		int[] b = {10,20,30,40,50,60};
		boolean equal = true;
		if(a.length == b.length)
		{
			for (int i = 0; i < b.length; i++)
			{
				if(a[i] != b[i])
				{
						equal = false;
				}
			}	
		}
		else
		{
			equal = false;
		}
		
		if (equal) {
			System.out.println("Two arrays are Equals");
		}
		else
		{
			System.out.println("Two arrays are Not Equals");
		}
	}
}
