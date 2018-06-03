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
public class Calender3 {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 2);
		Date d1= cal.getTime();
		System.out.println(d1);
	}
}
