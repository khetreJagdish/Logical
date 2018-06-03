package com.lara;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
		
	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<>(10);
		int[] array;
		for (int i = 0; i < 20; i++) {
			
			hashSet.add(i);
			Iterator<Integer> iterator  = hashSet.iterator();
			
			while (iterator.hasNext()) {
				Integer integer = (Integer) iterator.next();
				System.out.println(integer);
			} 
			
		}
		System.out.println(hashSet);
	}
}
