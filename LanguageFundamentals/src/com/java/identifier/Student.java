/**
 * 
 */
package com.java.identifier;


public class Student {
		private String name = "Jagdish";
		private int rollNo = 10;
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getRollNo() {
			return rollNo;
		}
		
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		
	/*
		@Override
		public String toString() {
		Student s= new Student();
		return "Student Name : "+s.getName() + "  Student Roll number "+ s.getRollNo(); 
		}
		*/
}
