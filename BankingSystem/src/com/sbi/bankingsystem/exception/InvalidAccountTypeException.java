/**
 * 
 */
package com.sbi.bankingsystem.exception;

/**
 * @author JK
 *
 */
public class InvalidAccountTypeException extends Throwable {
			
	/**
	 * 
	 */
	public InvalidAccountTypeException() {
		this("Your Account Type is Invalid" );
	}
	
	public InvalidAccountTypeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public InvalidAccountTypeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public InvalidAccountTypeException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
}
