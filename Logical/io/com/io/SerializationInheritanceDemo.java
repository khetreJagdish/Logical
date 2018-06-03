package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable
{
	int i = 10;
}
class Tiger extends Animal
{
	int j = 20;
}

public class SerializationInheritanceDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
			Tiger tiger = new Tiger();
		    FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(tiger);
			
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Tiger d2  =(Tiger) ois.readObject();
			System.out.printf("Value of i and j is %d %d ",d2.i,d2.j);
	}

}
