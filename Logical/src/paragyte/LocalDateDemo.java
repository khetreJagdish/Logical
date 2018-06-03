package paragyte;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
public class LocalDateDemo {
	
	public static void main(String[] args) {
		LocalDate localTime = LocalDate.of(1901, Month.JANUARY, 1);
		System.out.println(localTime);
	}
}
