package com.lara;

class ThreadInterrupt extends Thread
{
	@Override
	public void run() {
		try {
			     for (int i = 0; i < 50; i++) {
					System.out.println("I am Lazy Thread"  +i );
					
					if (i >25) {
						System.out.println("Entering Into sleeping state");
						Thread.sleep(3000);
					}	
			     }
		} catch (Exception e) {
			System.out.println("I got Interruption");
		}
	}
}
public class ThreadInterruptedDemo {

	public static void main(String[] args) {
		ThreadInterrupt t = new ThreadInterrupt();
		t.start();
		t.interrupt();
		System.out.println("End Of Main Thread");
	}

}
