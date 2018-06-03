package com.lara;

public class StringBuilderWithMultThreadDemo implements Runnable 
{
	
	StringBuilder stringBuilder;
	
	public StringBuilderWithMultThreadDemo() {
		stringBuilder = new StringBuilder();
	}
	
	@Override
	public void run() {
			for (int i = 0; i < 10000; i++) {
				addChar();
			}
		
	}
	private void addChar() {
		
		try {
			stringBuilder.append("A");
			stringBuilder.append("A");
			//stringBuilder.deleteCharAt(0);
			stringBuilder.append("A");
			stringBuilder.append("A");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("A was not at index 0"+ e.getMessage());
		}
		
	}

	public static void main(String[] args) {
		
		StringBuilderWithMultThreadDemo stringBuilderWithMultThreadDemo = new StringBuilderWithMultThreadDemo();
		Thread t1 = new Thread(stringBuilderWithMultThreadDemo, "Thread One");
		Thread t2 = new Thread(stringBuilderWithMultThreadDemo, "Thread Two");
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Final StringBuilder Length : "+ stringBuilderWithMultThreadDemo.stringBuilder.length());
		
	}

}
