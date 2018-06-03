package anonymousclass;

import anonymousclass.NormalInnerClassDemo.InnerMostClass;

public  class AnonymousInnerClassDemo
{
	public static void main(String[] args)
	{
		
		NormalInnerClassDemo normalInnerClassDemo = new NormalInnerClassDemo()
				{
					@Override
						public void sayHello()
						{
							System.out.println(this.getClass().getName());
							
						}
					
				};
				normalInnerClassDemo.sayHello();
				NormalInnerClassDemo normalInnerClassDemo2 = new NormalInnerClassDemo();
				System.out.println(normalInnerClassDemo2.getClass().getName());
				
		NormalInnerClassDemo normalInnerClassDemo3 = new NormalInnerClassDemo()
				{
					@Override
					public void printHello()
					{
						System.out.println(this.getClass().getName());
					}
				};
				normalInnerClassDemo3.printHello();
				
				 normalInnerClassDemo.new InnerMostClass()
				{
					public void printHello()
					{
						System.out.println("From Protected sayHello Method");
					}
				};
				
				
				
				
	}
}
