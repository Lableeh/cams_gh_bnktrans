package com.ibm.cams.gh.onlinebank.domain;

import java.sql.Date;

public class withdraw {
	
	private int withdrawID;
	private String accountNumber;
	private String accountType;
	private double amount;
	private Date transDate;
	private double balance;
	
	public withdraw() {
		
	} 
	
	public withdraw(int withdrawID,String accountNumber,String accountType , double amount,Date transDate,double balance) {
		this.withdrawID = withdrawID;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.amount =amount;
		this.transDate=transDate;
		this.balance=balance;
	}
	
	public int getWithdrawID() {
		return withdrawID;
	}
	public void setWithdrawID(int withdrawID) {
		this.withdrawID = withdrawID;
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
