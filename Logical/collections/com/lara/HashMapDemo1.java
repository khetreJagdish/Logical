package com.lara;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo1 {

	public static void main(String[] args) {
		Map<Integer, String>  map = new HashMap<>();
		map.put(1, "Java");
		map.put(2, "C++");
		map.put(3,"Python");
		ArrayList l = new ArrayList<>();
		l.add(10);
		System.out.println(l);
		for(Map.Entry entry : map.entrySet())
		{
			System.out.print("Map Key : "+entry.getKey());
			System.out.println("  Map Value : "+entry.getValue());
		}
		System.out.println(map);
	}

}
