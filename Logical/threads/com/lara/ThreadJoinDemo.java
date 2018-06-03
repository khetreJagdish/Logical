package com.lara;
class ThreadJoin extends Thread
{
		static Thread mt;
		@Override
		public void run() {
			try {
				mt.join();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		}
}
public class ThreadJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadJoin.mt = Thread.currentThread();
		ThreadJoin tjd  = new ThreadJoin();
		tjd.start();
		tjd.join();                                                     
		for (int i = 0; i <10; i++) {
			System.out.println("Main Thread");
		}
	

	}

}
