package com.java;

public class Student {
	
	private String name;
	private int rollno;
	/**
	 * @return the name
	 */
	
	public Student(int rollno , String name) {
		
		this.rollno = rollno;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	
	@Override
	public String toString() {
		
		return "Roll no : " + rollno + "  name : "+ name ;
	}
	
}
