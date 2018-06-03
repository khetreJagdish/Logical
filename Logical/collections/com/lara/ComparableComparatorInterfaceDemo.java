package com.lara;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableComparatorInterfaceDemo {
	
	public static void main(String[] args) {
		
		List<User> list = new ArrayList<User>();
		list.add(new User(8 ,"Jagdish123" ));
		list.add(new User(6 ,"Anand123" ));
		list.add(new User(1 ,"Anurag123" ));
		
		Collections.sort(list);
		
		String[] fruits = {"Pineapple","Apple", "Orange", "Banana"};
		//Arrays.sort(fruits);
		
		int i = 0;
		for (String fruit : fruits) {
			System.out.println("fruit : " +  ++i + " : " + fruit );
		}
		
		Iterator<User> listIterator = list.iterator();
		
		while (listIterator.hasNext()) {
			User user = (User) listIterator.next();
			System.out.println(user.getRollno() + " " + user.getPassword() );
		}
		
	}
	
}
