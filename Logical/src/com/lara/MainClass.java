package com.lara;
class C
{
    static String s = "AAA";
 
    static
    {
    	System.out.println("Inside static C");
        s = s + "BBB";
    }
 
    {
    	System.out.println("Inside IIB C : ");
        s = "AAABBB";
    }
}
 
class E extends C
{
    static
    {
    	System.out.println("Inside static E: ");
        s = s + "BBBAAA";
    }
 
    {
    	System.out.println("Inside IIB E : ");
        System.out.println(s);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        E b = new E();
    }
}