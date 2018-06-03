package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws Exception {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat  simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(simpleDateFormat.format(date));
		
		if (date instanceof Date) {
			System.out.println("Date type");
		}
		
		Thread t = new Thread();
		System.out.println(Class.forName(args[0]).isInstance(t));

	}

}