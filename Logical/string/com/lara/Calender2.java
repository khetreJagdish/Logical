/**
 * 
 */
package com.lara;

import java.util.Calendar;
import java.util.Date;

/**
 * @author JK
 *
 */
public class Calender2 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		//cal.add(Calendar.DATE, 4);
		cal.add(Calendar.DATE, -5);
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}
