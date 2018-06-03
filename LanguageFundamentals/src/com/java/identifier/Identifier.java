/**
 * 
 */
package com.java.identifier;

import com.java.isarelationship.Demo;

/**
 * @author JK
 *
 */
  public class Identifier {
	  static Demo d1 = new Demo();
		// worst  kind of programming
	  
	  public void m1(int i)
	  {
		  System.out.println("From m1(int)");
	  }
		public static void main(String[] args) {
			int String = 10;
			int  Integer = 20;
			System.out.println("Integer : "+Integer);
			Identifier id = new Identifier();
			id.m2(10.5f);
			System.out.println(String);	
			System.out.println("\\n");	
		int Runnable = 20;
		System.out.println(Runnable);
		}
		public  void m2(float j)
		{
			System.out.println("from m1(float)");
		}
}
