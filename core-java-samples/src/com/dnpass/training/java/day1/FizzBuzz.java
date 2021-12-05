package com.dnpass.training.java.day1;
import java.util.*;
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner num = new Scanner(System.in);
		System.out.println("Enter the value:");
		int num1 = num.nextInt();
		if(num1%3==0 && num1%5==0) {
			System.out.println("Fizz Buzz");
				
		}else if (num1%3==0) {
			System.out.println("Fizz");
				
		}else if(num1%5==0) {
			System.out.println("Buzz");
		}
		num.close();	
		

	}

}
