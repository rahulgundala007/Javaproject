package com.dnpass.training.java.day7;

public class PrivelegedAccount extends Account {
	public void withdraw(double Amount) {
		super.setAccountBalance(super.getAccountBalance()-Amount);
	}

}
