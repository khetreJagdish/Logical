package com.list;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import com.collection.Person;

public class ArrayListDemo
{

	public static void main(String[] args)
	{
		Person person = new Person();
		person.setName("Jagdish");
		person.setId(1);
		
		Person person2 = new Person();
		person2.setName("Amey");
		person2.setId(2);
		
		Person person4 = new Person();
		person4.setName("Amit");
		person4.setId(5);
		
		List<Person> listOfPersons = new ArrayList<>(15);
		listOfPersons.add(person);
		listOfPersons.add(person2);
		listOfPersons.add(person4);
		
		
		Person person3 = listOfPersons.get(0);
		person3.setId(3);
		System.out.println(person3);
		System.out.println("List of Persons : "+listOfPersons.size());
//		System.out.println(listOfPersons.set(3,person4));                            java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
//		System.out.println("List of Persons : "+listOfPersons.size());
		
		Iterator<Person> listIterator = listOfPersons.iterator();
		
		while (listIterator.hasNext())
		{
			Person person5 = (Person) listIterator.next();
			System.out.println("ID : "+person5.getId() + " ,  Name : " + person5.getName()  );
		}
		
		
		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "Jagdish");
		hashMap.put(2, "Samir");
		hashMap.put(3,"Amit");
		
		
		
		Iterator iterator1 = hashMap.keySet().iterator();
		
		while(iterator1.hasNext())
		{
			String key =(String) iterator1.next();
			System.out.println(key);
		}
		
		Iterator   iterator = hashMap.entrySet().iterator();
		System.out.println("HashMap Iteration");
		while(iterator.hasNext())
		{
			
				Map.Entry pair =(Map.Entry) iterator.next();
				//System.out.println(pair.getKey() + " " + pair.getValue());
				//System.out.println(pair);
		}
		
		
		
		
		
	
	}

}
