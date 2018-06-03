/**
 * 
 */
package com.sbi.bankingsystem.exception;

/**
 * @author JK
 *
 */
public class CustomerNotFoundException extends Throwable
{
		
		/**
		 * 
		 */
		public CustomerNotFoundException() {
			this("Customer is Not Found...");
		}
		
		public CustomerNotFoundException(String message , Throwable cause) {
			super(message , cause);
		}
		
		public CustomerNotFoundException(String message ) {
			super(message );
		}
		
		public CustomerNotFoundException( Throwable cause) {
			super( cause);
		}
}
