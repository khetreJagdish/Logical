package com.lara;

class MyThreadDemo extends Thread
{
		
	static String message[] = {"Java", "is", "hot,", "aromatic,", "and", "invigorating."};
	
	public MyThreadDemo(String id) 
	{
		super(id);
	}
	
	@Override
	public void run() 
	{
		String name = Thread.currentThread().getName();
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		for (int i = 0; i < message.length; ++i) 
		{
			randomWait();
			System.out.println(name + message[i]);
		}
	}

	private void randomWait() {
		try {
			sleep((long) (300*Math.random()));
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}
