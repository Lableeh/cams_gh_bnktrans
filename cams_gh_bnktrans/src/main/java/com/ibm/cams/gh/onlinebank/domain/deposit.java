package com.ibm.cams.gh.onlinebank.domain;

import java.sql.Date;

public class deposit {

	private String depositID;
	private String accountNumber;
	private String accountType;
	private double amount;
	private Date transDate;
	private double balance;
	
	public String getDepositID() {
		return depositID;
	}
	public void setDepositID(String depositID) {
		this.depositID = depositID;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
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
