package com.dnpass.training.java.day8;
import java.util.*;
public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num1 and num2");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 > 0 && num2 > 0) {
			try {
				num = Math.pow(num1, num2);
			} catch (ArithmeticException e) {
				System.out.println("AE==>" + e.getMessage());
			}
			System.out.println(num);
		}

	}
}
