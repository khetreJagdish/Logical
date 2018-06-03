package com.lara;

/*
 * Armstrong Number Examples
 *    153 = 13 + 53 + 33 = 1 + 125 + 27 = 153

      371 = 33 + 73 + 13 = 27 + 343 + 1 = 371
 * 
 * */
public class ArmstrongNumber {

	static void armstrongOrNot(int number) {
		int copyOfNumber = number;
		int noOfDigits = String.valueOf(number).length();
		int sum = 0;

		while (copyOfNumber != 0) {
			int lastDigits = copyOfNumber % 10;
			int lastDigitsToThePowerOfNoDigit = 1;
			for (int i = 0; i < noOfDigits; i++) {

				lastDigitsToThePowerOfNoDigit = lastDigitsToThePowerOfNoDigit * lastDigits;
			}
			sum = sum + lastDigitsToThePowerOfNoDigit;
			copyOfNumber = copyOfNumber / 10;
		}

		if (sum == number) {
			System.out.println("Number is an Armstrong Number ");
		} else {
			System.out.println("Number is Not an Armstrong Number ");
		}
	}

	public static void main(String[] args) {

		armstrongOrNot(153);
		armstrongOrNot(1535);
		armstrongOrNot(371);

	}
}
