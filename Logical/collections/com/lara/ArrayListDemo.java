package com.lara;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Vector v = new Vector<>();
		v.add(10);
		System.out.println("isEmpty() : "+v.isEmpty());
		v.add("Hello");
		v.addElement(new Integer(10));
		System.out.println("Vector : " + v);
		
		ArrayList list = new ArrayList<>(16);
		System.out.println(list.size());
		list.add(20);
		list.add(0,10);
		list.add(1,"a");
		list.addAll(2, v);
		Object[] s = list.toArray();
		System.out.println("s : Objectclass toString() method : "+ s);
		
		for (Object object : s) {
			String s1 = (String) object.toString();
			System.out.println(s1);
			
		}
		System.out.println("list.contains() : "+list.contains(10)+ " list.get(1) : " + list.get(1));
		System.out.println("List.size() : "+list.size());
		System.out.println("List : "+list);
		
		for (int i = 0; i < list.size(); i++) {
			
			System.out.print(list.get(i)+" ");
			
		}
		System.out.println();
		
		list.set(2,155);
		System.out.println(list);
		list.remove(1);
		list.clear();
		System.out.println(list.retainAll(list));
		System.out.println(list);
		
		ArrayList l = new ArrayList<>();
		LinkedList li = new LinkedList<>();
		
		
		System.out.println(l instanceof Serializable);
		System.out.println(li instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		System.out.println(li instanceof RandomAccess);
		System.out.println(l instanceof Iterable);
		System.out.println(l instanceof Iterator);
		System.out.println(li instanceof Iterable);
		System.out.println(li instanceof Iterator);
		
	}

}
