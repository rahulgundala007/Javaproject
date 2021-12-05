package com.dnpass.training.java.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.dnpass.training.java.day9.DataLoader;
import com.dnpass.training.java.day9.Transaction;

interface Something{
	public String doit(Integer i);
}
@FunctionalInterface
interface HelloFunctionalInterface{
	public String sayHello();
	//public String sayWord();
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloFunctionalInterface msg = () -> {
			return "Hello";
		};
		System.out.println(msg.sayHello()+"world!");
		
		
		LambdaDemo lambdaDemo = new LambdaDemo();
		lambdaDemo.demo();

	}
	private void demo() {
		//anonymous inner class syntax and clearly suffers from a vertical problem
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("howdy world");
			}
		};
		r.run();
		
		//more then just an anonymous class instance.
		
		Runnable r2 =() -> System.out.println("howdy world");
		r2.run();
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(4);
		numbers.add(56);
		numbers.add(53);
		numbers.add(25);
		numbers.add(54);
		numbers.forEach((n) ->{
			System.out.println(n);
		});
		
		
		//one liner with implicit return
		Comparator<String> c =(String lhs, String rhs) ->lhs.compareTo(rhs);
		int result = c.compare("hello","world" );
		System.out.println(result);
		
		// with return statement
		Comparator<String> c1 = (String lhs,String rhs) ->{
			System.out.println("I am comparing " +lhs + " to "+ rhs);
			return lhs.compareTo(rhs);
		};
		result = c1.compare("hi", "hi");
		System.out.println(result);
		
		//Type inference
		Comparator<String> c2 =(lhs,rhs) -> {
			System.out.println("I am comparing " +lhs + " to "+ rhs);
			return lhs.compareTo(rhs);
		};
		result = c2.compare("hell","hell");
		System.out.println(result);
		
		LambdaDemo lambdaDemo = new LambdaDemo();
		List<Transaction> transactions = DataLoader.newTransactions();
		
		
		//anonymous inner class
		Comparator<Transaction> c3= new Comparator<Transaction>() {
			public int compare(Transaction h1, Transaction h2) {
				return h1.getId().compareTo(h2.getId());
			}
		};
		Collections.sort(transactions,c3);
		System.out.println(transactions);
		
		//lambda
		Collections.sort(transactions, (lhs,rhs)->lhs.getId().compareTo(rhs.getId()));
		System.out.println(transactions);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
