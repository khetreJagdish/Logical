package com.set;

import java.util.HashSet;
import java.util.Set;

import com.collection.Person;

public class HashSetDemo
{
	public static void main(String[] args)
	{
//		Set<Person> setOfPersons = new HashSet<>();
//		Person person = new Person();
//		person.setId(1);
//		person.setName("Jagdish");
//		
//		
//		Person person2 = new Person();
//		person2.setId(2);
//		person2.setName("Amit");
//		
//		
//		Person person3 = new Person();
//		person3.setId(1);
//		person3.setName("Jagdish");
//		
//		
//		
//		setOfPersons.add(person);
//		setOfPersons.add(person2);
//		setOfPersons.add(person3);
//		
//		System.out.println(setOfPersons);
		
		Set set = new HashSet<>();
		set.add(1);
		set.add("Hello");
		set.add(false);
		
		System.out.println(set);
	}
}
