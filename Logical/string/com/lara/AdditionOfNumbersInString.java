package com.lara;

public class AdditionOfNumbersInString {

	 static int sum;
	public static void main(String[] args) {
		int sum = getSumOfIntegersInString("yes 18idi squaly 6fied");
		System.out.println("Sum is :" + sum);
	}

	private static int getSumOfIntegersInString(String string) {
		string=string.replaceAll("[\\D]+"," ");
		String[] stringArray = string.split("[\\D]");
		int sum = 0;
		for (int i = 0; i < stringArray.length; i++) {
			
			try {
				sum = sum + Integer.parseInt(stringArray[i]);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		return sum;
			
}
}