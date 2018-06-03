package com.lara;

/**
 * @author JK
 *
 */
public class String4 {


	public static void main(String[] args) {
				
		int i = 2345;
		System.out.printf("(%10d)", i);
		System.out.printf("\n(%010d)",i);
		System.out.printf("\n(%-10d)",i);
		System.out.printf("\n(%-010d)",i); //  java.util.IllegalFormatFlagsException: Flags = '-0'
	}

}
