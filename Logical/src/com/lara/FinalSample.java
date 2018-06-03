package com.lara;

public class FinalSample {
		

	public static void main(String[] args) {
		
		String string = "String";
		System.out.println(string.length());
		string = "String1";
		char[] charArr = {'J', 'A','V','A'};
		String str = new String(charArr);
	System.out.println(charArr);
	
	String concat = "Java" + "Concept"+ "Of" +"The" + "Day";
	System.out.println(concat);
	
	String str1 = new String("Java");
	String str2 = new String("Concept");
	String str3 = new String("Of");
	String str4 = new String("The");
	String str5 = new String("Day");
	
	System.out.println(str1+str2+str3+str4+str5);
	}
}
