package com.java.seialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationUtil
{
	
	public static void serializaObject(Object obj , String fileName)
	{
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		Person person = new Person();
		try
		{
			 fileOutputStream = new FileOutputStream("C:/Users/JK/Desktop/sample.txt");
			 objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(person);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				fileOutputStream.close();
			} catch (IOException e)
			{
			
				e.printStackTrace();
			}
		}
	}
	
}
