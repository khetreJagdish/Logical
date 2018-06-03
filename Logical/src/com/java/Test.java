package com.java;

interface Sad
{

}
class Head implements Sad
{
	
	
}
class Tail implements Sad
{
	public static String overLoad(Head head)
	{
		return "Head";
	}

	public static String overLoad(Tail tail)
	{
		return "Tail";
	}
	public static String overLoad(Sad sad)
	{
		return "Sad";
	}

	public static String overLoad(Object obj)
	{
		return "Object";
	}
}


public class  Test
{
	public static void main(String[] args) 
	{
		Sad sad = new Head();
		Test test = new Test();
		Tail tail =new Tail();
		overLoad(new Head());
		       // System.out.println(overLoad(sad));
			//String test1 = overLoad(	test);
			//System.out.println(test1);
				//System.out.println(overLoad((Object)tail));
	}

	private static void overLoad(Head head)
	{
		// TODO Auto-generated method stub
		
	}
}
