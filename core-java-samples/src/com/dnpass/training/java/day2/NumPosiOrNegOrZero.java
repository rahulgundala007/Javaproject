package com.dnpass.training.java.day2;
import java.util.Scanner;
public class NumPosiOrNegOrZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("enter the value:");
		int num1 = num.nextInt();
		if(num1>0) {
			System.out.println("+ve number");
		} else if(num1<0){
			System.out.println("-ve number");
		} else {
			System.out.println("Zero");
		}
		num.close();
	}

}
