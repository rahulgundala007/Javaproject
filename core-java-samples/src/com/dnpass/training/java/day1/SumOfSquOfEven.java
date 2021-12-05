package com.dnpass.training.java.day1;
import java.util.*;
public class SumOfSquOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value:");
		int num = sc.nextInt();
		int n1=0;int sum =0;
		while(num !=0) {
			n1=num%10;
			if(n1%2==0) {
				sum += n1*n1;
				
			}
			num /=10;
		}
		System.out.println(sum);
		sc.close();

	}

}
