/**
 * 
 */
package com.sbi.bankingsystem.exception;

/**
 * @author JK
 *
 */
public class InsufficientBalanceException extends Throwable {
		
		/**
		 * 
		 */
		public InsufficientBalanceException() {
			this("Your Balance is Insufficient ");
		}
		
		public InsufficientBalanceException(String message , Throwable cause) {
			super(message, cause);
		}
		
		public InsufficientBalanceException(String message) {
			super(message);
		}
		
		public InsufficientBalanceException(Throwable cause) {
			super(cause);
		}
}
