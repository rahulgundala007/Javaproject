package com.dnpass.training.java.day14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;



public class MethodReferencesDemo {

	@FunctionalInterface

	interface MyInterface {

		void display();

	}

	static class Example {
		public void myMethod() {
			System.out.println("Instance Method");
		}

	}

	static class Multiplication {
		public static int multiply(int a, int b) {
			return a * b;

		}

	}

	@FunctionalInterface
	interface HelloInterface {
		Hello display(String say);
	}

	static class Hello {
		public Hello(String say) {
			System.out.print(say);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example obj = new Example();

		// 1. Method reference to an instance method of an object
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod;

		// Calling the method of functional interface
		ref.display();

		BicycleComparator bikeFrameSizeComparator = new BicycleComparator();

		//createBicyclestist().stream().sorted((a, b) -> bikeFrameSizeComparator.compare(a, b));

		//createBicyclestist().stream().sorted(bikeFrameSizeComparator::compare);

		// 2. Method reference to a static method of a class

		BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;

		int pr = product.apply(11, 5);
		System.out.println("Product of given number is: " + pr);

		// 3. Method reference to an instance method of an arbitrary object of a

		// particular type
		String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon" };
		// Method reference to an instance method of an arbitrary object of a particular
		// type

		Arrays.sort(stringArray, String::compareToIgnoreCase);
		for (String str : stringArray) {
			System.out.println(str);

		}

		List<Integer> numbers = Arrays.asList(5, 3, 50, 24, 40, 2, 9, 18);
		numbers.stream().sorted((a, b) -> a.compareTo(b));
		numbers.stream().sorted(Integer::compareTo);

		// 4. Method reference to a constructor

		HelloInterface ref1 = Hello::new;
		ref1.display("Hello World!");

		// private static Collection<Bicycle> createBicyclesList() {
		// TODO Auto-generated method stub
		// return null;

		// }

	}

}

class Bicycle {

	private String brand;
	private Integer frameSize;

	// standard constructor, getters and setters 
	public String getBrand() {
		return brand;

	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getFrameSize() {
		return frameSize;

	}

	public void setFrameSize(Integer frameSize) {
		this.frameSize = frameSize;

	}

	

}
class BicycleComparator implements Comparator<Bicycle> {

	@Override
	public int compare(Bicycle a, Bicycle b) {
		return a.getFrameSize().compareTo(b.getFrameSize());

	}

}
