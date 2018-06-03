package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class HardToRead
{

	public static void main(String[] args)
	{
		Person person = new Person();
		person.setId(1);
		person.setName("Jagdish");
		person.setSalary(20000);
		//System.out.println(person.toString()+ " \n");
		
		Integer integer = 5;
		Integer integer2 = 5;
		String string = "Hello";
		String string2 = "Hello";
		String string3 = new String("Hello");
		String string4 = new String("Hello");
		
//		System.out.println(".equals() Method : "+integer.equals(integer2));
//		System.out.println(string == string2); // true
//		System.out.println(" "+string == string2); // false
//		System.out.println(integer == integer2); // true
		Thread t = new Thread();
		
		Runnable runnable = null;
		System.out.println(runnable  instanceof  Thread );
		System.out.println(t  instanceof  Runnable );
		
		//System.out.println(string3.equals(string4));
	
		HardToRead hardToRead = new HardToRead();
		System.out.println(hardToRead.hashCode());
	
		List<String> liStrings = new ArrayList<String>();
		Set<String> set = new HashSet<>();
		
		Vector<Integer> vector = new Vector<>();  
	}
	
	@Override
	public int hashCode()
	{
		
		return super.hashCode();
	}

}
