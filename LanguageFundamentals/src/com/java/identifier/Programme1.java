/**
 * 
 */
package com.java.identifier;

import java.lang.reflect.*;

 class Programme1 {

	
	public static void main(String[] args) throws ClassNotFoundException {
			
		int count = 0;
		Student s1 = new Student();
		Student s2 = new Student();
		    Class c = Class.forName("java.lang.Object");
			Method[] m =c.getDeclaredMethods();
			Identifier id = new Identifier();
		//	id.m1();
			for (Method method : m) {
				count ++;
				System.out.println(method.getName());
			}
			
			System.out.println("Number of methods : " + count);
			System.out.println(s1);
			
	}

}
