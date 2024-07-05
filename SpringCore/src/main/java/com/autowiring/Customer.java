package com.autowiring;

public class Customer {
	private String customerName;
	private Bank bank;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", bank=" + bank + "]";
	}

}
