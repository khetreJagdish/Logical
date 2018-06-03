package com.lara;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
		
	public static void main(String[] args) {
		
		Vector v = new Vector<>(20);
		v.addElement(10);
		v.addElement("hello");
		v.insertElementAt("A",1);
//		v.addElement(null);
//		v.addElement(null);
		v.addElement(new Integer(15));
		System.out.println(v);
		System.out.println("Capacity : "+v.capacity());
		
		Enumeration en = v.elements();
		
		
		
		for (Object object : v) {
			String s = (String) object.toString();
			System.out.print(s+" ");
		}
		
	}
}
