package equalsmethod;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class EqualsMethoddemo
{

	public static void main(String[] args)
	{
		
		Long l = new Long(100);
		//System.out.println(l.MAX_VALUE);
		
		int s = Integer.parseInt("1");
		//System.out.println(s);
		
		Float f = new Float(100.5);
		Float f1= new Float("10.5f");
		
		char  paramChar='c';
		Character ch = new Character(paramChar);
		
		Boolean b = new Boolean("tru");
		Boolean b1 = new Boolean("false");
		System.out.println(b);
		System.out.println(b1);
		
		System.out.println(b1.equals(b));
		;
		
		Student student1  = new Student("Ram" , 101);
		Student student2  = new Student("Jagdish",102);
		Student student3  = new Student("Ram",101);
		Student student4  = student2;
		
		Class clss = student1.getClass();
		Method[] m=clss.getDeclaredMethods();
		//System.out.println(student2.equals(student4));
		
		for (Method m1: m)
		{
			//System.out.println(m1.getName());
		}
//		System.out.println(null instanceof Object);
//		System.out.println(student1.equals(student2));
//		System.out.println(student1.equals(student3));
//		System.out.println(student1.equals("Hello"));
//		System.out.println(student1.equals(null));
		
	}
}
