package com.dnpass.training.java.day7;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savAcc = new SavingsAccount(1,1000,0.5);
		CurrentAccount curAcc= new CurrentAccount(2, 2000);
		
		savAcc.deposit(1000);
		
		savAcc.transfer(1000, curAcc);
		
		curAcc.withdraw(2000);
		
		curAcc.transfer(200, curAcc);
		
		savAcc.addInterest();
		curAcc.deductFees();
		
		System.out.println("account saving balance ="+savAcc.getAccountBalance());
		System.out.println("account current balance="+curAcc.getAccountBalance());

	}

}
