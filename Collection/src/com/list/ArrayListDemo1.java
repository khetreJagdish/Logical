package com.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListDemo1
{
	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList<>();
		arrayList.add(10);
		arrayList.add("Hello");
		arrayList.add(8);
		
		Iterator iterator = arrayList.iterator();
		
		while (iterator.hasNext())
		{
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}
}
