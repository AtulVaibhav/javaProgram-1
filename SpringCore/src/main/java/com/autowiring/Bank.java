package com.autowiring;

public class Bank {
    private String bankAccount;
    private String bankName;
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "Bank [bankAccount=" + bankAccount + ", bankName=" + bankName + "]";
	}
    
    
}
