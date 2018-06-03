package com.lara;

public class CountNumberOfWordsInString {

	public static void main(String[] args) {
		
		String word = "How to count a number of words  in given String in Java?";
		countNumberOfWordsInString(word);
	}

	private static void countNumberOfWordsInString(String word) {
		String[] wordArray = word.split("\\s+");
		for (String string : wordArray) {
			System.out.println(string);
		}
		System.out.println("Number of word in a String : " + wordArray.length) ;
	}

}
