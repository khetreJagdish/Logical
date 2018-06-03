
/*
 * Program to how many Sundays fell on the first of the month during the twentieth century (1 JANUARY 1901 to 31 DECEMBER 2000)
 * */

package paragyte;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class NumberOfSundayInMonth {
	
	public static void main(String[] args) {
	    int count = 0;
	    LocalDate date1 = LocalDate.of(1901, Month.JANUARY, 1);
	    LocalDate endDate = LocalDate.of(2000, Month.DECEMBER, 1);
	    
	    while (date1.isBefore(endDate)) {
	        date1 = date1.plusMonths(1);
	        if (date1.getDayOfWeek() == DayOfWeek.SUNDAY) {
	            count++;
	        }
	    }
	    System.out.println(count);
	}
}
