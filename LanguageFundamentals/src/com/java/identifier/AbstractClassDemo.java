package com.java.identifier;
abstract class Abstract
{
	private int b = 10;
	protected int c = 20;
	int d = 40;
	static int i = 50;
	
	public void  method() 
	{
		System.out.println("Hello");
	}
	
	abstract protected void name();
}
public class AbstractClassDemo extends Abstract 
{
	
	@Override
	public void name() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
	}
}

interface AbstractInterface
{
	 int a = 0; // Bydefault public , static and final.
}
