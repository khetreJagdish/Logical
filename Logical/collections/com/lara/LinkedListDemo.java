/**
 * 
 */
package com.lara;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

/**
 * @author JK
 *
 */
public class LinkedListDemo {
		
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList<>(10000);
		LinkedList ll = new LinkedList<>();
		ll.add(null);
		ll.add(null);
		Integer[] arr = {30,40,50};
		Hashtable d = new Hashtable<>();
		Vector<Integer> vc = new Vector<>(-1);
		vc.addElement(10);
		vc.addElement(20);
		vc.addElement(30);
		vc.copyInto(arr);
		System.out.println("Array : "+arr.toString());
		System.out.println("Vector : " + vc);
		Set s = new HashSet<>(ll);
		s.addAll(ll);
		System.out.println("Set : "+s);
		System.out.println("LinkedList : "+ll);
	}
}
