package iopackage;

public class AbstractClassDemo extends AbstractClass
{
	public void hello()
	{
		System.out.println("Hello Java");
	}
	public static void main(String[] args)
	{
		
		System.out.println(Demo.x);
		
			//AbstractClass.demo();
//		 We can' t  Create an Object For Abstract Class.
//		for e.g.
	AbstractClassDemo abstractClass = new AbstractClassDemo();
	abstractClass.hello();
	}
	static
	{
		System.out.println("This is from static Block");
	}
	
	{
		System.out.println("This is from IIB");
	}
	public AbstractClassDemo()
	{
		System.out.println("This is from public Constructor of AbstractClassDemo() ");
	}
}


abstract class Abstract
{
		static
		{
			System.out.println("This is from static block of Abstract");
		}
		{
			System.out.println("This is from IIB of Abstract");
		}
	 Abstract()
	{
		System.out.println("FromDefault Abstract() Constructor");
	}
	public static void helloDEmo()
	{
		System.out.println("HEllo from HelloDEmo");
	}
}
class AbstractClass 
{
	static
	{
		System.out.println("This is from static block of AbstractClass");
	}
	
	{
		System.out.println("This is from IIB of AbstractClass");
	}
	protected AbstractClass()
	{
		System.out.println("From protetcted AbstractClass() constructor");
	}
	public static  void demo()
	{
		System.out.println("Hello from demo");
		//Abstract.helloDEmo();
	}
}

interface Demo
{
	final String x ="123";
	
}
