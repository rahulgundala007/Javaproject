package com.dnpass.training.java.day9;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {

	static List<Transaction> transactionsDatabase = new ArrayList<Transaction>();
	static {
		transactionsDatabase = DataLoader.newTransactions();
	}

	public static void main(String[] args) {
		TransactionService newService = new TransactionService();

		System.out.println("initially");
		for (Transaction t : transactionsDatabase) {
			System.out.println(t);
		}

		// creating new transaction
		Transaction newTrans1 = new Transaction(201, ProductType.FUEL, 454.65, "Canada", "USD");
		newService.create(newTrans1);
		System.out.println("\n\n\nafter creating new transaction\n");
		for (Transaction t : transactionsDatabase) {
			System.out.println(t);
		}

		// deleting a transaction
		newService.delete(newTrans1);
		System.out.println("\n\n\nafter removing a transaction\n");
		for (Transaction t : transactionsDatabase) {
			System.out.println(t);
		}

		System.out.println("\n\n");

		// updating a transaction
		Transaction updateTrans = new Transaction(127, ProductType.FUEL, 1234.5, "Hyderabad", "INR");
		newService.update(updateTrans);
		System.out.println("\nAfter updating a transaction with Id = " + updateTrans.getId());
		for (Transaction t : transactionsDatabase) {
			System.out.println(t);
		}

		// finding specific transaction
		System.out.print("\n\nDoes transaction [" + newTrans1 + "] exist : ");
		System.out.println(newService.find(newTrans1));

		// finding transaction by transaction Id
		newService.findById(132);

		// finding transaction by product type
		List<Transaction> transByProductType = newService.findByProductType(ProductType.FUEL);
		System.out.println("\n\nTransactions by product type : FUEL");
		for (Transaction t : transByProductType) {
			System.out.println(t);
		}

		// finding transaction by product type and Id

		List<Transaction> transByProductIdAndType = newService.findByIdAndProductType(128, ProductType.FUEL);
		System.out.println("\n\nTransactions by Id and product type ");
		for (Transaction t : transByProductIdAndType) {
			System.out.println(t);
		}

		// finding transactions by Id, product type and city
		List<Transaction> transactionsByIdProductTypeAndCity = newService.findByIdAndProductTypeAndCity(130,
				ProductType.FRUITS, "banglore");
		System.out.println("\n\nTransactions by Id,product type and city");
		for (Transaction t : transactionsByIdProductTypeAndCity) {
			System.out.println(t);
		}

	}

	public void create(Transaction tran) {
		transactionsDatabase.add(tran);

	}

	public void update(Transaction tran) {

		for (Transaction t : transactionsDatabase) {
			if ((int) t.getId() == (int) tran.getId()) {

				t.setType(tran.getType());
				t.setAmount(tran.getAmount());
				t.setCity(tran.getCity());
				t.setCurrency(tran.getCurrency());
			}
		}

	}

	public void delete(Transaction tran) {
		transactionsDatabase.remove(tran);
	}

	public boolean find(Transaction tran) {

		for (Transaction t : transactionsDatabase) {
			if (tran == t) {
				return true;
			}
		}
		return false;

	}

	public void findById(Integer id) {

		for (Transaction t : transactionsDatabase) {
			if ((int) t.getId() == (int) id) {
				System.out.printf("\nTransaction with Id : %d \n", id);
				System.out.println(t);
			}
		}

	}

	public List<Transaction> findByProductType(ProductType type) {
		List<Transaction> transactionsByProductType = new ArrayList<Transaction>();
		for (Transaction t : transactionsDatabase) {
			if (t.getType() == type) {
				transactionsByProductType.add(t);
			}
		}

		return transactionsByProductType;
	}

	public List<Transaction> findByIdAndProductType(Integer id, ProductType type) {

		List<Transaction> transByProductIdAndType = new ArrayList<Transaction>();
		for (Transaction t : transactionsDatabase) {
			if ((int) t.getId() == (int) id && t.getType() == type) {
				transByProductIdAndType.add(t);
			}
		}

		return transByProductIdAndType;
	}

	public List<Transaction> findByIdAndProductTypeAndCity(Integer id, ProductType type, String city) {
		List<Transaction> transactionsByIdProductTypeAndCity = new ArrayList<Transaction>();
		for (Transaction t : transactionsDatabase) {
			if (t.getType() == type && (int) t.getId() == (int) id && t.getCity() == city) {
				transactionsByIdProductTypeAndCity.add(t);
			}
		}

		return transactionsByIdProductTypeAndCity;
	}
}
