package com.dnpass.training.java.day7;

public class CurrentAccount extends Account {
	private static final int FREE_TRANSACTION=3;
	public static final double TRANSACTION_FEE=2.0;
	
	private double transactionCount;
	
	public CurrentAccount(int accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
		
		transactionCount=0;
		
	}

	@Override
	public void deposit(double Account) {
		// TODO Auto-generated method stub
		transactionCount++;
		super.deposit(Account);
	}

	@Override
	public void withdraw(double Amount) {
		// TODO Auto-generated method stub
		transactionCount++;
		super.withdraw(Amount);
	}
	public void deductFees() {
		if(transactionCount>FREE_TRANSACTION) {
			double fees= TRANSACTION_FEE*(transactionCount-FREE_TRANSACTION);
			super.withdraw(fees);
		}
		transactionCount=0;
	}
	

}
