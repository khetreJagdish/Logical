/**
 * 
 */
package com.lara;

import java.util.Date;

/**
 * @author JK
 *
 */
public class String13 {
	
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime());
		System.out.println(d2);
	}
}
