package com.lara;

public class ReverseString {

	static String strl = "";
		public static void main(String[] args) {
			
			// Using StringBuffer class
			StringBuffer sb = new StringBuffer("JAVACONCEPTS");
			System.out.println(sb.reverse());
			
			//Using Iterative method
			
			String str  = "MyJava";
			
			char[] ch = str.toCharArray();
			for (int i = ch.length-1; i >=0 ; i--) 
			{	
				System.out.print("  "+ch[i]);
				
			}
			System.out.println();
			
			
			// Using Recursive Method
			System.out.println(recursiveMethod("JAVACONCEPTSOFTHEDAYHELLO"));
			
		}
		
		static String recursiveMethod(String str)
		{
			
			if ((str == null) || (str.length() <= 1))  {
				return str;
			}
			else
			{
				strl = strl + str.charAt(str.length() - 1)  + (recursiveMethod(str.substring(0, str.length()-1))); 
				return strl;
			}
			
		}
}
