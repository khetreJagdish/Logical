package com.lara;

import java.util.Stack;

public class SwitchDemo {
       
	public static void main(String[] args) {
			Stack<String> person = new Stack<>();
			person.push("Jagdish");
			person.push("name");
			person.push("Anand");
			person.push("Aaryn");
			
			System.out.println(person);
			
			
				person.pop();
			
			
			
			System.out.println(person);
			
			person.pop();
			System.out.println(person);
			person.pop();
			System.out.println(person);
			person.pop();
			System.out.println(person);
			person.pop();
			System.out.println(person);
			
}
}