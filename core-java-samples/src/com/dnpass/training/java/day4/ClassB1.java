package com.dnpass.training.java.day4;

public class ClassB1 extends ClassA{
	int c = 60;
	int d = 70;

	void sub() {
		int sub = c - a;
		System.out.println("the subration of c-a:" + sub);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB1 access = new ClassB1();
		System.out.println(access.a);
		access.add();
		access.sub();
		System.out.println(access.c);
		System.out.println(access.d);

	}

}


