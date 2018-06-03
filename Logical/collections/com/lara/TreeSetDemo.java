package com.lara;

import java.util.TreeSet;

public class TreeSetDemo {
		
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("AD");
		t.add("B");
		t.add("AB");
		t.add("L");
		t.add("Z");
		//t.add(null);
		//t.add(1);            // Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
		System.out.println(t);
	}
}
