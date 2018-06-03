package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null;
		
		fis = new FileInputStream("pom.xml");
		int b;
		
		while ((b = fis.read()) != -1)
		{
			System.out.print((char)b );
		}
		fis.close();
	}
}
