package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
	String userName = "System";
	transient String password = "root";
	transient int pin = 1234;
	
	private void writeObject(ObjectOutputStream os) throws Exception {
		
		os.defaultWriteObject();
		String epassword = "12&3@54"+password;
		int epin = 4444 + pin;
		os.writeObject(epassword);
		os.writeInt(epin);
	}
	
	private void readObject(ObjectInputStream is) throws Exception
	{
		is.defaultReadObject();
		String epassword = (String)is.readObject();
		password = epassword.substring(7);
		int epin = is.readInt();
		pin = epin - 4444;
	}
	
}
public class CustomizedSerializationDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Account a = new Account();
		System.out.println("Username : " + a.userName + " "+ "  Password : " + a.password + "  Pin Number : " + a.pin);	
		// Serialization
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		// Deserialization
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account ac = (Account)ois.readObject();
		System.out.println("Username : " + ac.userName + " "+ "  Password : " + ac.password + "  Pin Number : " + ac.pin);
		
		

	}

}
