/**
 * 
 */
package com.sbi.bankingsystem.beans;

import java.util.ArrayList;

/**
 * @author JK
 *
 */
public class Customer {
	private int customerId;
	private String customerName;
	private Address laddress;
	private Address haddress;
	private ArrayList<Account> account = new ArrayList<Account>();

	/**
	 * 
	 */
	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, Address laddress, Address haddress,
			ArrayList<Account> account) {
		super();

		this.customerId = customerId;
		this.customerName = customerName;
		this.laddress = laddress;
		this.haddress = haddress;
		this.account = account;
	}

	public Customer(String customerName, Address laddress, Address haddress, ArrayList<Account> account) {
		super();
		this.customerName = customerName;
		this.laddress = laddress;
		this.haddress = haddress;
		this.account = account;
	}

	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the laddress
	 */
	public Address getLaddress() {
		return laddress;
	}

	/**
	 * @param laddress the laddress to set
	 */
	public void setLaddress(Address laddress) {
		this.laddress = laddress;
	}

	/**
	 * @return the haddress
	 */
	public Address getHaddress() {
		return haddress;
	}

	/**
	 * @param haddress the haddress to set
	 */
	public void setHaddress(Address haddress) {
		this.haddress = haddress;
	}

	/**
	 * @return the account
	 */
	public ArrayList<Account> getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(ArrayList<Account> account) {
		this.account = account;
	}
	
	

}
