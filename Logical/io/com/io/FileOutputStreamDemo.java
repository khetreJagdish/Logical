package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis =new FileInputStream("pom.xml");
		FileOutputStream fos =new FileOutputStream("abc.docx");
		int b;
		
		while ((b = fis.read()) != -1) {
			
			fos.write(b);
			
		}
		System.out.println("File Copied Successfully");
		
		fis.close();
		fos.close();
		
		
	}

}
