package com.dnpass.training.java.day7;

public class SavingsAccount extends Account {
	private double interestRate;
	
	public SavingsAccount(int accountNumber ,double accountBalance, double interestRate) {
		super(accountNumber,accountBalance);
		this.interestRate=interestRate;
	}
	
	public void addInterest() {
		double interest= getAccountBalance()*interestRate/100;
		super.deposit(interest);
	}

}
