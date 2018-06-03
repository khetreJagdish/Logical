package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable
{
	Cat c = new Cat();
}
class Cat implements Serializable
{
	Rat r = new Rat();
}

class Rat implements Serializable
{
	int j = 20;
}
public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
			Dog d = new Dog();
		    FileOutputStream fos = new FileOutputStream("abc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d);
			
			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog d2  =(Dog) ois.readObject();
			System.out.printf("Value of j is %d ",d2.c.r.j);
	}

}
