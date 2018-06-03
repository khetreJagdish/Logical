/**
 * 
 */
package com.sbi.bankingsystem.beans;

/**
 * @author JK
 *
 */
public class Address {
		private String city;
		private String state;
		private int pincode;
		
		/**
		 * 
		 */
		public Address() {
			super();
		}
		
		public Address(String city, String state, int pincode)
		{
			
			super();
			this.city = city;
			this.state = state;
			this.pincode = pincode;
			
		}

		/**
		 * @return the city
		 */
		public String getCity() {
			return city;
		}

		/**
		 * @param city the city to set
		 */
		public void setCity(String city) {
			this.city = city;
		}

		/**
		 * @return the state
		 */
		public String getState() {
			return state;
		}

		/**
		 * @param state the state to set
		 */
		public void setState(String state) {
			this.state = state;
		}

		/**
		 * @return the pincode
		 */
		public int getPincode() {
			return pincode;
		}

		/**
		 * @param pincode the pincode to set
		 */
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		
		/* (non-Javadoc)
		* @see java.lang.Object#toString()
		*/
		@Override
		public String toString() {
		
		return "City : " + getCity() + " : State : " + getState() + " : PinCode : " + getPincode();
		}
}
