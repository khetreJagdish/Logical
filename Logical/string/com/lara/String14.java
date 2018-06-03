/**
 * 
 */
package com.lara;

import java.util.Date;

/**
 * @author JK
 *
 */
public class String14 {
	public static void main(String[] args) {
		
		Date d1 = new Date();
		long num = d1.getTime();
		Date d2 = new Date(num+1000*60*60*24);
		Date d3 = new Date(num+1000*60*60*24*7);
		Date d4 = new Date(num-1000*60*60*24*7);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
	}
}
