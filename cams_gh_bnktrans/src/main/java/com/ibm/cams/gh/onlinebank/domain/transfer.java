package com.ibm.cams.gh.onlinebank.domain;

import java.sql.Date;

public class transfer {
	
	private int transferID;
	private String accountNumber;
	private String accountTypeFrom;
	private String accountTypeTo;
	private String accountNumberTo;
	private double amount;
	private Date transDate;
	private double balance;
	
	
	public int getTransferID() {
		return transferID;
	}
	public void setTransferID(int transferID) {
		this.transferID = transferID;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountTypeFrom() {
		return accountTypeFrom;
	}
	public void setAccountTypeFrom(String accountTypeFrom) {
		this.accountTypeFrom = accountTypeFrom;
	}
	public String getAccountTypeTo() {
		return accountTypeTo;
	}
	public void setAccountTypeTo(String accountTypeTo) {
		this.accountTypeTo = accountTypeTo;
	}
	public String getAccountNumberTo() {
		return accountNumberTo;
	}
	public void setAccountNumberTo(String accountNumberTo) {
		this.accountNumberTo = accountNumberTo;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getTransDate() {
		return transDate;
	}
	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
