package com.dnpass.training.java.day7.ExceptionHandling;

import com.dnpass.training.java.day7.SavingsAccount;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount savAcc = new SavingsAccount(1,1000,0.5);
		CurrentAccount curAcc= new CurrentAccount(2, 2000);
		
		try{
			savAcc.deposit(1000);
		
			savAcc.deposit(12000);
			savAcc.deposit(1000);
			savAcc.deposit(12000);
		
	
		
			curAcc.withdraw(152000);
			curAcc.withdraw(23000);
			curAcc.withdraw(2000);
		
			curAcc.transfer(200, curAcc);
		
			savAcc.addInterest();
			curAcc.deductFees();
		}catch (InsufficientFundsException e) {
			System.out.println(e);
		}
		System.out.println("hii.......");
		
		System.out.println("account saving balance ="+savAcc.getAccountBalance());
		System.out.println("account current balance="+curAcc.getAccountBalance());


	}

}
