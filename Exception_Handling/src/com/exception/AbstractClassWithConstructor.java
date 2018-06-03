package com.exception;
	
	abstract class Person1
	{
		String name;
		int age;
		
		public Person1(String name , int age)
		{
			this.name = name;
			this.age = age;
		}
	}

	class Teacher1 extends Person1
	{
		double salary;
		String subject;
		
		public Teacher1(String name, int age, double salary, String subject)
		{
			super(name, age);
			this.salary = salary;
			this.subject = subject;
			System.out.println("Name Of the Teacher : " + name + " , Age : " + age + "  , Salary : " + salary + " , Subject : " + subject);
		}
	}

class Student1 extends Person1
	{
		int rollno;
		int marks;
		
		public Student1(String name, int age, int rollno, int marks)
		{
			super(name, age);
			this.rollno = rollno;
			this.marks = marks;
			System.out.println("Name Of the Student : " + name + " , Age : " + age + " , Roll No : " + rollno + " , Marks : " + marks);		
		}
		
	}

	public class AbstractClassWithConstructor
	{
		public static void main(String[] args)
		{
			Student1 student = new Student1("Jagdish", 25, 60, 80);
			Teacher1 teacher = new Teacher1("Durga", 48, 100000,"Java");
			AbstractClassWithConstructor constructor = new AbstractClassWithConstructor(){
				
				
				private void syso()
				{
					
					System.out.println("Hello From Inerer class");
				}
				
			};
			
			
		}
	}


