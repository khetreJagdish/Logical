package paragyte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWordInFile {

	
	public static void main(String[] args) {
	
		HashMap<String, Integer> hashMap  =new HashMap<>();
		BufferedReader reader  = null;
		 
		try {
			
			reader = new BufferedReader(new FileReader("abc.txt"));
			String currentLine =reader.readLine();
			while (currentLine != null) {
				
				String[] words = currentLine.toLowerCase().split(" ");
				
				for (String string : words) {
					
					if (hashMap.containsKey(string)) {
						hashMap.put(string, hashMap.get(string)+1);
					}
					else {
						hashMap.put(string, 1);
					}
				}
				
				currentLine =reader.readLine();
			}
			
			
			String mostRepeatedWord = null;
			int count  = 0;
			
			Set<Entry<String, Integer>>  entries = hashMap.entrySet();
			
			for (Entry<String, Integer> entry : entries) {
				if (entry.getValue() > count) {
					mostRepeatedWord = entry.getKey();
					count = entry.getValue();
				}
			}
			System.out.println("The most repeated word  in the text file : "+ mostRepeatedWord);
			System.out.println("number of occurences : " + count);
		} catch (IOException e) {
			e.getMessage();
		}
		finally {
			try {
						reader.close();
			} catch (IOException e2) {
				e2.getMessage();
			}
		}
		
		

	}

}
