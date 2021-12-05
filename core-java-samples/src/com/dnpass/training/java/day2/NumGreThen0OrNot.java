package com.dnpass.training.java.day2;
import java.util.Scanner;
public class NumGreThen0OrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num= new Scanner(System.in);
		int num1 = num.nextInt();
		if(num1>0) {
			System.out.println("+ve number");
		} else {
			System.out.println("not +ve");
		}
		num.close();
	}

	

}
