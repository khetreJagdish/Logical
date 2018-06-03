/**
 * 
 */
package com.java.isarelationship;
import com.java.identifier.*;
/**
 * @author JK
 *
 */
public class Demo  extends ArrayListDemo
{
		
		public  void method1(){
			
			System.out.println("Hello From method1");
		}
		public static void main(String[] args) {
			Demo d1 = new Demo();
			d1.method1();
		//	d1.method2(); // The method method2() is undefined for the type Demo
			IsDemo d2 = new IsDemo();
			d2.method1();
			d2.method2();
			
			
			
			Demo d3 = new IsDemo();
			d3.method1();                                  
	//		d3.method2();                           // Invalid
		}
}
class IsDemo extends Demo{
	
	public void method2() {
		System.out.println("Hello From method2");
	}
	

}
