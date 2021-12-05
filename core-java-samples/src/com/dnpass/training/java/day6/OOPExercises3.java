package com.dnpass.training.java.day6;


public class OOPExercises3 {
	static int a = 555;

	public static void main(String[] args) {
		abc objA1 = new abc();
		B objB1 = new B();
		abc objB2 = new B();
		C objC1 = new C();

		B objC2 = new C();

		abc objC3 = new C();

		objA1.display();

		objB1.display();

		objB2.display();

		objC1.display();

		objC2.display();

		objC3.display();
	}

}

class abc {

	int a = 100;

	public void display() {

		System.out.printf("a in A = %d\n", a);

	}

} // class A

class B extends abc {

	private int a = 123;

	public void display() {

		System.out.printf("a in B = %d\n", a);

	}

} // class B

class C extends B {

	private int a = 543;

	public void display() {

		System.out.printf("a in C = %d\n", a);

	}

} // class C
