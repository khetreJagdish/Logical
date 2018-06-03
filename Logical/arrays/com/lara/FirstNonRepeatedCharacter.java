package com.lara;

import java.util.Scanner;
public class FirstNonRepeatedCharacter 
{	
public static void main(String[] args)
{

Scanner s=new Scanner(System.in);
System.out.println("Enter the String ");
String str=s.next();
char found=searchChar(str);
System.out.println("The first non repeated char is "+found);
}


public static char searchChar(String a)
{
	char[] arr=new char[a.length()];

		for(int j=0;j<arr.length;j++)
			{
				arr[j]=a.charAt(j);          // Apple          arr = {'A', 'p','p','l','e'}
			}
			
	int i=0;
	while(i!=a.length()) // i=5 , a.length()=5
	{
		int count=0;
		for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
					{
						if(a.charAt(i)!=arr[j])
							{
								count++;
							}
					}
				if(count==a.length()-1)
					{
							return a.charAt(i);
					}
			}
		i++;
	}
	return 0;
	}
}

