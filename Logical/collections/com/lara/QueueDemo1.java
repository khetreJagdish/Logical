package com.lara;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo1 {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		for (int i = 0; i < 10; i++) {
			
			q.add(i);
		}
		
		Iterator<Integer> itr = q.iterator();
		
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.println(integer)	;
		}
		
		int head = q.peek();
		System.out.println(" Head " + head);
		int element = q.element();
		System.out.println("Element : " + element);
		int size = q.size();
		System.out.println("Size : " + size);
		
		System.out.print(" Odd Numbers ; " );
		for (Integer integer : q) {
			if (integer % 2 == 0) {
				int temp = q.remove();
				System.out.print(" "+temp);
			}
			
		}
	}
}
