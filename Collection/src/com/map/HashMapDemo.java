package com.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo
{

	public static void main(String[] args)
	{
		HashMap< String, String> employeeHashMap = new HashMap<>();
		employeeHashMap.put("Pune", "Amol");
		employeeHashMap.put("Mumbai","Jagdish");
		employeeHashMap.put("Nagar", "Rahul");
		employeeHashMap.put("Beed", "Amol");
		
		System.out.println(employeeHashMap);
		
		HashMap<Integer,String> mobileHasMap = new HashMap<>();
		System.out.println("=========== Mobile Store =============");
		mobileHasMap.put(1,"NOKIA");
		mobileHasMap.put(2,"SAMSUNG");
		mobileHasMap.put(3,"SONY");
		mobileHasMap.put(4, "LENOVO");
		
		for(Integer key : mobileHasMap.keySet())
		{
			System.out.println("Key : " + key + "  Value : " + mobileHasMap.get(key));
		}
		
		
		
		/* Four Ways Of Iterating HashMap */
		
		// 1 . Using ForEach Loop
		
		
		System.out.println("===========Employee With ForEach Loop  =============");
		for(String key : employeeHashMap.keySet())
		{
			System.out.println("Key : " + key + "   Value : "  + employeeHashMap.get(key));
		}
		
		
		System.out.println("===========Employee With Iterator Cursor  =============");
		Iterator<String> iterator = employeeHashMap.keySet().iterator();
		
		while(iterator.hasNext())
		{
			String key = iterator.next();
			System.out.println("Key : " + key + "  Value : " + employeeHashMap.get(key));
		}

		System.out.println("===========Employee With Map.Entry Interface  =============");
		
		
		
		
//		Hashtable<Integer, String> personHashtable = new Hashtable<>();
//		personHashtable.put(1,"Jagdish");
//		//personHashtable.put(null,"Hello");
//		personHashtable.put(2, null);
//		personHashtable.put(3, "Amol");
//		personHashtable.put(3, "Amol");
//		
//		System.out.println(personHashtable);
	}

}
