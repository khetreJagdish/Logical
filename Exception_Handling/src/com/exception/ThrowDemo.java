package com.exception;

public class ThrowDemo
{
	public static void main(String[] args) throws InsufficientException
	{
		
		throw new InsufficientException("Insufficient Data...");
		
	}
}
