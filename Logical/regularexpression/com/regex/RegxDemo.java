package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxDemo 
{

	public static void main(String[] args) {
			int count = 0;
		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m = p.matcher("1ab1baab1ab@lksklnsl54156$");
		while (m.find()) {
			count++;
			System.out.println(m.start() + "...." + m.end() + " ... " + m.group());
			System.out.println("Number of Occurences of  " +m.group()
			+" " + count);
		}
		
		

	}

}
