package com.dnpass.training.java.day2;
import java.util.*;
public class MaxOf3Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("enter the value90");
		int num1 =num.nextInt();
		System.out.println("enter the num1:"+num1);
		int num2 = num.nextInt();
		System.out.println("enter the num2:"+num2);
		int num3 = num.nextInt();
		System.out.println("enter the num3:"+num3);
		if (num1>num2 && num1> num3){
			System.out.println("Max value is "+num1);
		} else if(num2>num1 && num2>num3) {
			System.out.println("Max value is "+num2);
		} else {
			System.out.println("Max value is "+num3);
		}
		num.close();
	}

}
