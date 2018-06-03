package com.lara;

class A
{
	int i;
	public A(int i) {
		this.i = i;
	}
	
	
}

class B
{
	int i;
	public B(int i)
	{
		this.i = i;
	}
	
	@Override
	public String toString() {
		
		return " i   "+i;
	}
}
public class StringExample {
	public static void main(String[] args) {
	
		A a = new A(100);
		String s = "Java";
		System.out.println(s+a);
		
		B b = new B(500);
		System.out.println(s+b);
		
		int i = 5000;
		
		double d = 6000.006;
		
		System.out.println(i+d+s);
		System.out.println(s+i+d);
		System.out.println(d+s+i);
	
	// concat() method
		String str ="Programming";
		System.out.println(s.concat(str));
		
		String s1 = "Java Concept Of The Day";
		 
        System.out.println(s1.charAt(5));      //Output : C
 
        System.out.println(s1.charAt(10));     //Output : p
 
        System.out.println(s1.charAt(25)); 
	
	}
	
	
}
