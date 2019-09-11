package com.wipro.bank.dao;

import java.util.ArrayList;
import java.util.List;

import com.wipro.bank.bean.Account;
import com.wipro.bank.bean.Customer;

/**
 * @author muthu selvam
 *
 */

public class AccountDAO {

	public List<Account> accounts = new ArrayList<Account>();
	public List<Customer> customers = new ArrayList<Customer>();

	public String saveAccount(Account account) {
		accounts.add(account);
		return "New Customer & Account created: SUCCESS";
	}

	public List<Account> findAllAccounts() {
		Account acc1 = new Account(1, new Customer(1, "cust1"), 100.0);
		Account acc2 = new Account(2, new Customer(2, "cust2"), 0.0);
		Account acc4 = new Account(4, new Customer(4, "cust4"), 123.0);
		Account acc5 = new Account(5, new Customer(5, "cust5"), 984.0);
		accounts.add(acc1);
		accounts.add(acc2);
		accounts.add(acc4);
		accounts.add(acc5);
		return accounts;
	}

	public List<Customer> findAllCustomers() {
		this.accounts.forEach(account -> customers.add(account.getCustomer()));
		return customers;
	}

	public Account findByAccuntId(int accountNumber) {
		// find value from the array using accountNumber.
		for (Account account : accounts) {
			if (account.getAccountID() == accountNumber) {
				return account;
			}
		}
		return null;
	}

	public String transferFunds(int from, int to, double amount) {
		double fromAccount = findByAccuntId(from).getBalance();
		double toAccount = findByAccuntId(to).getBalance();
		if (fromAccount >= amount) {
			findByAccuntId(from).setBalance(fromAccount - amount);
			findByAccuntId(to).setBalance(toAccount + amount);
		} else {
			return "INSUFFICIENT FUNDS";
		}
		return "SUCCESS";
	}

}
