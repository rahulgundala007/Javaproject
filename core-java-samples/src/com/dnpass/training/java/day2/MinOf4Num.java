package com.dnpass.training.java.day2;
import java.util.*;
public class MinOf4Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.println("enter the value");
		int num1 =num.nextInt();
		System.out.println("enter the num1:"+num1);
		int num2 = num.nextInt();
		System.out.println("enter the num2:"+num2);
		int num3 = num.nextInt();
		System.out.println("enter the num3:"+num3);
		int num4 = num.nextInt();
		System.out.println("enter the num4:"+num4);
		
		int[] arr= {num1,num2,num3,num4};
		Arrays.sort(arr);
		System.out.println("the minmum value is:"+ arr[0]);
		num.close();
		
	}
}