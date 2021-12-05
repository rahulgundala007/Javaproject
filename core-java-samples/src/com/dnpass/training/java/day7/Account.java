package com.dnpass.training.java.day7;

public class Account {
	
	private static int lastAssignedNumber=0;
	private int accountNumber;
	private double accountBalance;
	
	public Account(int accountNumber, double accountBalance) {
		this.accountNumber=accountNumber;
		this.accountBalance=accountBalance;
		
	}
	
	public Account() {
		lastAssignedNumber++;
		accountNumber=lastAssignedNumber;
	}
	
	public Account(double accountBalance) {
		this.accountBalance=accountBalance;
	}
	
	public void showData() {
		System.out.println("Account number = "+accountNumber);
		System.out.println("Account balance = "+accountBalance);
	}
	
	public void deposit(double depositAccount) {
		if(depositAccount<0) {
			
		}else {
			accountBalance=accountBalance+depositAccount;
		}
	}
	public void  withdraw(double withdrawAmount) {
		if(accountBalance<withdrawAmount) {
			
		}
		else {
			accountBalance=accountBalance-withdrawAmount;
		}
	}
	
	public void transfer(double Amount,Account other) {
		withdraw(Amount);
		other.deposit(Amount);
	}

	public static int getLastAssignedNumber() {
		return lastAssignedNumber;
	}

	public static void setLastAssignedNumber(int lastAssignedNumber) {
		Account.lastAssignedNumber = lastAssignedNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
