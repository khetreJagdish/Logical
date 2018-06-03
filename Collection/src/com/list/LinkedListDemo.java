package com.list;

import java.util.LinkedList;

public class LinkedListDemo
{
	public static void main(String[] args)
	{
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		linkedList.add("E");
		linkedList.add("F");
		System.out.println(linkedList);
		
		System.out.println(linkedList.size());
		linkedList.add(2, "G");													// add()  add element at given index and pushes that current element to the next index
		System.out.println(linkedList);
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		linkedList.set(3, "H");														// set() replaces Existing element
		System.out.println(linkedList);
		
	}
}
