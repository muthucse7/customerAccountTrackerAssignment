/**
 * 
 */
package com.wipro.bank.main;

import com.wipro.bank.bean.Account;
import com.wipro.bank.bean.Customer;
import com.wipro.bank.service.AccountService;

/**
 * @author muthu selvam
 *
 */
public class ConsoleBasedJavaApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AccountService process = new AccountService();
		
		System.out.println("************** Get All Accounts *****************");
		System.out.println(process.getAllAccounts());

		
		System.out.println("\n************** Get All Customers *****************");
		System.out.println(process.getAllCustomers());
		Account userTest1 = process.getBalanceOf(1);
		System.out.println("\n@ Account details of account number:" + 1 + " is :" + "\n## " + userTest1);
		userTest1 = process.getBalanceOf(4);
		System.out.println("\n@ Account details of account number:" + 4 + " is as follows" + "\n## "+ userTest1);
		System.out.println("\n########## Account Balance for given account number ##########");
		Account userTest2 = process.getBalanceOf(3);
		System.out.println("@ Account details of account number:3 .." + "## " + userTest2 + " sorry user doesn't exist\n");

		
		System.out.println("############ All Customer Details ############");
		System.out.println(process.getAllCustomers());
		System.out.println("\n ############ Transfer of Funds from account number 4 to 5 ############");
		String transferStatus = process.transferFunds(4, 5, 100);
		System.out.println("@ Fund Transfer from account 4 to account 5 is: " + transferStatus);
		transferStatus = process.transferFunds(4, 5, 100);
		System.out.println("@ Response of fund transfer when funds are in sufficient : " + transferStatus);
		userTest1 = process.getBalanceOf(4);
		System.out.println("@ Available balance for account number: 4 is" + "\n## " + userTest1);
		userTest1 = process.getBalanceOf(5);
		System.out.println("@ Account details of account number: 5 is" + "\n## " + userTest1);
		
		
		System.out.println("*******************************************************\n");
		Customer cust3 = new Customer(3, "cust3");
		Account acc3 = new Account(9, cust3, 0.0);
		System.out.println("New Customer & Account created: " + process.addAccount(acc3));
		System.out.println("\n************** Get All Customers *****************");
		System.out.println(process.getAllCustomers());
	}
}
