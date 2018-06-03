package com.lara;

import java.util.ArrayList;
import java.util.List;

public class IterateAndRemove {

	public static void main(String[] args) {
			
		
		List<String> jedis = new ArrayList<>(); 
		jedis.add("Luke");
		jedis.add("Yoda");
		
		System.out.println(jedis);
		
		for (String string : jedis) {
			if (Character.isLowerCase(string.charAt(0))) {
					
				jedis.remove(string);
			}
		}
		
		System.out.println(jedis);
	}

}
