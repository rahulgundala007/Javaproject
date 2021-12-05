package com.dnpass.training.java.day3;
import java.util.*;
public class First2EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num =new Scanner(System.in);
		int count =0; int sum=0;
		
		do {
			System.out.println("Enter the value num:");
			int num1= num.nextInt();
			if(num1%2==0) {
				count++;
				sum +=num1;
			}
			
		}while(count<2);{
		System.out.println("the sum of two even numbers is:"+sum);	
		num.close();
		}
	}
}

