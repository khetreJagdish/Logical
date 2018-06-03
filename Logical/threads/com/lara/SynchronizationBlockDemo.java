package com.lara;
class Display
{
	
	public synchronized void wish(String name) {
		synchronized (Display.class) 
		{
		for(int i = 0; i<10; i++)
		{
			System.out.print("Good Morning  ");
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) {}
			System.out.println(name);
		}
		}
		
	}
}
class MyThreadClass extends Thread
{
	Display d;
	String name;
	public MyThreadClass(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	@Override
	public void run() {
		d.wish(name);
	}
}
 class SynchronizationBlockDemo {
		
	 public static void main(String[] args) {
		
		 	Display d1 = new Display();
		 	Display d2 = new Display();
			MyThreadClass  t1 = new MyThreadClass(d1,"Dhoni");
			MyThreadClass  t2 = new MyThreadClass(d2,"Yuvraj");
			
			t1.start();
			t2.start();
	}
		
		
}
