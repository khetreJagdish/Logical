/**
 * 
 */
package com.lara;

import java.util.Date;

/**
 * @author JK
 *
 */
public class String11 {
	
	public static void main(String[] args) {
		Date d1 = new Date(0);
		Date d2 = new Date(1000);
		System.out.println("d1.getTime() : "+d1.getTime());
		System.out.println("d1.compareTo(d2) : " + d1.compareTo(d2));
		System.out.println( "d1.before(d2) : " + d1.before(d2));
		System.out.println("d1.after(d2) : " + d1.after(d2));
	
	}
}
