/**
 * 
 */
package com.sbi.bankingsystem.services;

import java.util.ArrayList;

import javax.security.auth.login.AccountNotFoundException;

import com.sbi.bankingsystem.beans.Account;
import com.sbi.bankingsystem.beans.Customer;
import com.sbi.bankingsystem.beans.Transaction;
import com.sbi.bankingsystem.exception.CustomerNotFoundException;
import com.sbi.bankingsystem.exception.InsufficientBalanceException;
import com.sbi.bankingsystem.exception.InvalidAccountNumberException;
import com.sbi.bankingsystem.exception.InvalidAccountTypeException;
import com.sbi.bankingsystem.exception.InvalidAmmountException;
import com.sbi.bankingsystem.exception.InvalidCustIdException;
import com.sbi.bankingsystem.exception.InvalidPincodeException;

/**
 * @author JK
 *
 */
public interface BankServices {
				
				int acceptCustomerDetails(String custName , String homeAddresssCity, String homeAddressState,
						                                                  int homeAddressPincode, String localAddresscity, String localAddressState,
						                                                  int localAddressPinCode) throws InvalidPincodeException;
	
				int openAccount(int custId, int balance, String accType) throws InvalidCustIdException , 
																		CustomerNotFoundException, InvalidAmmountException,
																		InvalidAccountTypeException;
				
				int getAccountBalance (int custId, int accNo)  throws InvalidCustIdException, CustomerNotFoundException,
																		InvalidAccountNumberException,AccountNotFoundException;
				
				int withDraw(int custId, int accountNumber, int amount) throws InvalidCustIdException,
																		CustomerNotFoundException, InvalidAccountNumberException,
																		InvalidAmmountException, AccountNotFoundException,
																		InsufficientBalanceException;
				
				boolean fundTransfer(int custIdFrom, int accountNoFrom, int customerIdTo, int accountNoTo, int ammount ) throws 
																		InvalidCustIdException, CustomerNotFoundException,
																		InvalidAccountNumberException,AccountNotFoundException,
																		InvalidAmmountException, InsufficientBalanceException;
				
				int deposit(int custId, int accNo, int ammount) throws InvalidCustIdException, InsufficientBalanceException,
																		InvalidAmmountException,InvalidAccountNumberException,
																		CustomerNotFoundException, AccountNotFoundException;
																	
				Customer getCustomerDetails(int custId) throws InvalidCustIdException , CustomerNotFoundException;
				
				Account getAccountDetails(int custId, int accNo) throws InvalidAccountNumberException, InvalidCustIdException,
																		AccountNotFoundException, CustomerNotFoundException;
				
				ArrayList<Account> getAccountDetails(int custId) throws InvalidCustIdException, CustomerNotFoundException;
				
				ArrayList<Transaction> getAllTransactionDetails(int custId, int accNo) throws InvalidCustIdException,
																		CustomerNotFoundException,InvalidAccountNumberException,
																		AccountNotFoundException;
																				
}
