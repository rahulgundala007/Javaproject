package com.dnpass.training.java.day9;


import java.util.ArrayList; 
import java.util.List;

public class DataLoader {

	public static List<Transaction> newTransactions() { 
		List<Transaction> transactions = new ArrayList<Transaction>();

		transactions.add(new Transaction (123, ProductType.FUEL, 33.33, "london", "GBP"));

		transactions.add(new Transaction (124, ProductType.GROCERIES, 12000.12, "london", "GBP")); 
		transactions.add(new Transaction (125, ProductType.FRUITS, 175.75, "bangalore", "INA"));
		transactions.add(new Transaction (126, ProductType.GROCERIES, 152.52, "bangalore", "INR")); 
		transactions.add(new Transaction (127, ProductType.GROCERIES, 12.12, "sanfrancisco", "USD"));
		transactions.add(new Transaction(128, ProductType. FUEL, 33.33, "bangalore", "INR"));
		transactions.add(new Transaction (129, ProductType.GROCERIES, 120.12, "London", "GBP"));
		transactions.add(new Transaction (130, ProductType. FRUITS, 175.75, "bangalore", "INR"));
		transactions.add(new Transaction (131, ProductType.GROCERIES, 152.52, "bangalore", "INR")); 
		transactions.add(new Transaction (132, ProductType.GROCERIES, 12.12, "london", "GBP")); 
		return transactions;

	}
	
	
}
