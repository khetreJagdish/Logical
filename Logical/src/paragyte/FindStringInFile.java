package paragyte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class FindStringInFile {
	
	
	
	public static void main(String[] args) {
		
		BufferedReader reader = null;
		
		try {
			
			reader = new BufferedReader(new FileReader("abc.txt"));
			String currentLine = null;
			
			while((currentLine = reader.readLine() )!= null)
			{
				String[] words = currentLine.toLowerCase().trim().split(" ");
				
				for (String inputWord : words) 
				{
					
					if(inputWord.equalsIgnoreCase("program"))
					{
						System.out.println("Word found ");
					}
					
				}
			}
				
		} catch (Exception e) {
			e.getMessage();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
