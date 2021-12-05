package com.dnpass.training.java.day3;
import java.util.*;
public class MenuOfOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("enter num1:");
		int num1 = num.nextInt();
		System.out.println("enter num2:");
		int num2 = num.nextInt();
		System.out.println("choose the menu");
		System.out.println("Add for 1");
		System.out.println("subtract for 2");
		System.out.println("multiply for 3");
		System.out.println("divide for 4");
		System.out.println("exit for 5");
		System.out.println("enter the option");
		int num3 = num.nextInt();
		switch (num3) {
		case 1:
			System.out.println("you choose add:" + (num1 + num2));
			break;
		case 2:
			System.out.println("you choose sub:" + (num1 - num2));
			break;
		case 3:
			System.out.println("you choose mul:" + (num1 * num2));
			break;
		case 4:
			System.out.println("you choose div:" + (num1 / num2));
			break;
		case 5:
			System.out.println("you choose to exit");
			break;
		default:
			System.out.println("you choose invalid no");
			break;
		
		}
		num.close();
	}

}
