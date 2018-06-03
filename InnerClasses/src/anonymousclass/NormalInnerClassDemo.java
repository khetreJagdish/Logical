package anonymousclass;

public class NormalInnerClassDemo
{
	 public class InnerMostClass
	{
		protected  void printHello()
		{
			System.out.println("Hello From Inner Classes...");
		}
		
		public void sayHello()
		{
			System.out.println("Say Hello...");
		}
	}
	public static void main(String[] args)
	{
		
//		NormalInnerClassDemo normalInnerClassDemo = new NormalInnerClassDemo();
//		NormalInnerClassDemo.InnerMostClass innerMostClass = normalInnerClassDemo.new InnerMostClass();
//		innerMostClass.printHello();
		
		
		//OR
		
		new NormalInnerClassDemo().new InnerMostClass().printHello();
	}
	protected void sayHello()
	{
	System.out.println("This is from sayHello() of NormalInnerClassDemo");
		
	}
	
	public  void printHello()
	{
		System.out.println("Hello From Inner Classes...");
	}
}