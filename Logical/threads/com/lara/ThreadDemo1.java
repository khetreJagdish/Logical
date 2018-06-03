package com.lara;
class Demo extends Thread
{
	
//	@Override
//	public void run() {	
//		for (int i = 0; i <10; i++) {
//			System.out.println("from Child thread   :");
//		}
//		
//	}
}

public class ThreadDemo1 {
		public static void main(String[] args) {
			
			Demo d1 = new Demo();
			d1.start();
				
			
			
			
		}
}
