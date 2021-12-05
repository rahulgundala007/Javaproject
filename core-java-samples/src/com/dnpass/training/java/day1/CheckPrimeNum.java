package com.dnpass.training.java.day1;
import java.util.*;
public class CheckPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 0;
		Scanner num= new Scanner(System.in);
		System.out.println("enter the value: ");
		int num1 = num.nextInt();
		for(int i=2;i<=num1/2;i++) {
			if(num1%i==0) {
				temp=1;
				break;
			}
			
		}
		if(temp == 0) {
			System.out.println("It is Prime number");
		}else {
			System.out.println("not a Prime Number");
		}
		
		num.close();
		

	}

}
