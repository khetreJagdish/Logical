package com.sbi.bankingsystem.beans;

import java.util.ArrayList;

/**
 * @author JK
 *
 */
public class Account {

	private int accountID;
	private String accountType;
	private int balance;
	private ArrayList<Transaction> transaction = new ArrayList<Transaction>();

	/**
	 * 
	 */
	public Account() {
		super();
	}

	public Account(int accountID, String accountType, int balance) {
		super();
		this.accountID = accountID;
		this.accountType = accountType;
		this.balance = balance;

	}

	public Account(String accountType, int balance) {
		this.accountType = accountType;
		this.balance = balance;
	}

	/**
	 * @return the accountID
	 */
	public int getAccountID() {
		return accountID;
	}

	/**
	 * @param accountID
	 *            the accountID to set
	 */
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType
	 *            the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the balance
	 */
	public int getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(int balance) {
		this.balance = balance;
	}

	/**
	 * @return the transaction
	 */
	public ArrayList<Transaction> getTransaction() {
		return transaction;
	}

	/**
	 * @param transaction
	 *            the transaction to set
	 */
	public void setTransaction(ArrayList<Transaction> transaction) {
		this.transaction = transaction;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[ Account ID = " + getAccountID() + "  : Account Type = " + getAccountType() + "  : Balance = "
				+ getBalance() + " Transaction : " + getTransaction() + " ]";
	}

}
