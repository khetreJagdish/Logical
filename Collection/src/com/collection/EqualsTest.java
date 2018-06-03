package com.collection;

public class EqualsTest
{
	public static void main(String[] args)
	{
		Moof moof = new Moof(8);
		Moof moof2 = new Moof(8);
		
		if (moof.equals(moof2))
		{
			System.out.println("One and Two are equal");
		}
	}
	
}

class Moof
{
	private int moofValue;
	
	public Moof(int val)
	{
		moofValue = val;
	}
	
	public int getMoofValue()
	{
		
		return moofValue;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if((obj instanceof Moof)  && (((Moof)obj).getMoofValue() == this.moofValue))
		{
			return true;
		}
		return false;
	}
}
