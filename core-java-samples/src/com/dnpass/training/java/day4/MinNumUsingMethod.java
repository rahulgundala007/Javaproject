package com.dnpass.training.java.day4;
import java.util.*;
public class MinNumUsingMethod {
	int num1,num2;
	public void min(int num1,int num2) {
		if(num1>num2) {
			System.out.println("the min value is:"+num2);
		}else {
			System.out.println("the min value is:"+num1);
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinNumUsingMethod min1=new MinNumUsingMethod();
		Scanner num = new Scanner(System.in);
		System.out.println("enter num1:");
		int num1 = num.nextInt();
		System.out.println("enter num2:");
		int num2 = num.nextInt();
		min1.min(num1, num2);
		num.close();

	}

}
