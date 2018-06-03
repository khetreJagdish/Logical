package com.sbi.bankingsystem.dao;

import java.util.ArrayList;

import com.sbi.bankingsystem.beans.Account;
import com.sbi.bankingsystem.beans.Customer;
import com.sbi.bankingsystem.beans.Transaction;

public interface BankingRepositoryService
{
	int insertCustomer(Customer customer);
	
	boolean updateCustomer(Customer customer);
	
	boolean updateTransaction(int custId, int accNo, Transaction transaction);
	
	Account getAccount(int custId, int accNo);
	
	ArrayList<Account> getAccountList(int custId);
	
	Customer getCustomer(int custId);
	
	ArrayList<Transaction> getTransaction(int custId, int accNo);
	
	boolean deleteCustomer(int custId);
	
	boolean deleteAccount(int custId, int accNo);
	
	int insertAccount(Account account, int custId);
	
	boolean updateAccount(int custId, Account account);
	
}
