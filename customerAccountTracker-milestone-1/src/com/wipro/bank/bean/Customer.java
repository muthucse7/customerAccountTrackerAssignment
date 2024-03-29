package com.wipro.bank.bean;

/**
 * @author muthu selvam
 *
 */
public class Customer {

	private int customerID;
	private String name;

	public Customer() {
	}

	public Customer(int customerID, String name) {
		super();
		this.customerID = customerID;
		this.name = name;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", name=" + name + "]";
	}

}
