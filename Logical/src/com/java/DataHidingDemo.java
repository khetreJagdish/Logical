package com.java;

public class DataHidingDemo {
		
		public static void main(String[] args) {
			
			Student student = new Student(10, "Jagdish");
			Student student1 = new Student(20, "Anurag");
			System.out.println(student);
			System.out.println(student1);
		}
	
}
