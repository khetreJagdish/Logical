import java.util.Set;
import java.util.TreeSet;

public class Enumdemo
{
	enum Day{
		
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}
	
	public static void main(String[] args)
	{
		Set<Day> set = new TreeSet<>();
		set.add(Day.SATURDAY);
		set.add(Day.WEDNESDAY);
		set.add(Day.FRIDAY);
		set.add(Day.WEDNESDAY);
		
		for (Day day : set)
		{
			System.out.println(day);
		}
	}
	
}
