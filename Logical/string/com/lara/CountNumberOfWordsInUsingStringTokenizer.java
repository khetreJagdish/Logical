package com.lara;

import java.util.StringTokenizer;

public class CountNumberOfWordsInUsingStringTokenizer {

	public static void main(String[] args) {
		
		String word = "How to, count a number of words, in given String in, Java?";
		StringTokenizer stringTokenizer = new StringTokenizer(word, ",");
		int count = 0;
		while (stringTokenizer.hasMoreElements()) {
			count++;
			System.out.println(stringTokenizer.nextToken());
			
		}
		System.out.println("word Count : " + count);

	}

}
