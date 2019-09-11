package com.wipro.bank.service;

import java.util.List;

import com.wipro.bank.bean.Account;
import com.wipro.bank.bean.Customer;
import com.wipro.bank.dao.AccountDAO;

/**
 * @author muthu selvam
 *
 */
public class AccountService {
	
	AccountDAO accountDAO = new AccountDAO();

	public String addAccount(Account acc) {
		return accountDAO.saveAccount(acc);
	}

	public List<Account> getAllAccounts() {
		return accountDAO.findAllAccounts();
	}

	public List<Customer> getAllCustomers() {
		return accountDAO.findAllCustomers();
	}

	public String transferFunds(int from, int to, double amount) {
		return accountDAO.transferFunds(from, to, amount);
	}

	public Account getBalanceOf(int accountNumber) {
		return accountDAO.findByAccuntId(accountNumber);
	}

}
