package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("Jagdish", 10));
		list.add(new Student("Anand", 20));
		list.add(new Student("Mayur", 30));
		list.add(new Student("Salman", 40));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
