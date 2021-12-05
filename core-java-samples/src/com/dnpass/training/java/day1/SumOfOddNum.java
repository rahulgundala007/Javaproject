package com.dnpass.training.java.day1;

import java.util.*;

public class SumOfOddNum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lastDigit =0;
		int sumOfOdd=0;
		Scanner num=new Scanner(System.in);
		System.out.println("enter the value:");
		int num1 = num.nextInt();
		
		while(num1!=0) {
			lastDigit = num1%10;
			if(lastDigit%2!=0) {
				sumOfOdd += lastDigit;
			}
			num1 /=10;
		}
		System.out.println(sumOfOdd);
		num.close();
			
		
		

		
	}




	
}