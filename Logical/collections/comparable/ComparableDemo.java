package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo
{
	
	public static void main(String[] args)
	{
		User user  = new User();
		User user2 = new User();
		List<User> list = new ArrayList<User>();
		list.add(user);
		list.add(user2);
		
		Collections.sort(list);
	}
	
}
