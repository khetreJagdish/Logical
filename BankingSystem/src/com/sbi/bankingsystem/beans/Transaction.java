/**
 * 
 */
package com.sbi.bankingsystem.beans;

/**
 * @author JK
 *
 */
public class Transaction {
		
		private int transactionID;
		private String transactionType;
		private int transactionAmmount;
		
		
		/**
		 * 
		 */
		public Transaction() {
			
		}
		
		public Transaction(int transactionID, String transactionType, int  transactionAmmount)
		{
			super();
			this.transactionID = transactionID;
			this.transactionType = transactionType;
			this.transactionAmmount = transactionAmmount;
		}
		
		
		
		/**
		 * @return the transactionID
		 */
		public int getTransactionID() {
			return transactionID;
		}
		/**
		 * @param transactionID the transactionID to set
		 */
		public void setTransactionID(int transactionID) {
			this.transactionID = transactionID;
		}
		/**
		 * @return the transactionType
		 */
		public String getTransactionType() {
			return transactionType;
		}
		/**
		 * @param transactionType the transactionType to set
		 */
		public void setTransactionType(String transactionType) {
			this.transactionType = transactionType;
		}
		/**
		 * @return the transactionAmmount
		 */
		public int getTransactionAmmount() {
			return transactionAmmount;
		}
		/**
		 * @param transactionAmmount the transactionAmmount to set
		 */
		public void setTransactionAmmount(int transactionAmmount) {
			this.transactionAmmount = transactionAmmount;
		}
		
		/* (non-Javadoc)
		* @see java.lang.Object#toString()
		*/
		@Override
		public String toString() {
		
		return "Transaction ID : " + getTransactionID() + " : Transaction Type : " + getTransactionType() + " : Transaction Ammount : " + getTransactionAmmount() ;
		}
		
	
}
