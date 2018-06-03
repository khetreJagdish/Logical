/**
 * 
 */
package com.sbi.bankingsystem.exception;

/**
 * @author JK
 *
 */
public class InvalidAccountNumberException extends Throwable {
		
		/**
		 * 
		 */
		public InvalidAccountNumberException() {
			this("Your Account Number is Invalid");
		}
		
		public InvalidAccountNumberException(String message , Throwable cause) {
			
			super(message , cause);
			// TODO Auto-generated constructor stub
		}
		
		public InvalidAccountNumberException(String message) {
			super(message);
			// TODO Auto-generated constructor stub
		}
		
		public InvalidAccountNumberException(Throwable cause) {
			super(cause);
			// TODO Auto-generated constructor stub
		}
}
