package com.dnpass.training.java.day5;
import java.util.*;
public class ArrSumAvg {
	int max;
	static int sum=0;
	static double avg=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		int[] arr;
		arr= new int[10];
		System.out.println("enter the value it should be less then 10:");
		int max = num.nextInt();
		System.out.println("enter the elements:");
		for(int i=0;i<max;i++) {
			arr[i]= num.nextInt();
		}
		System.out.println("the elements are");
		for(int i=0;i<max;i++) {
			System.out.println("arr[]:"+arr[i]);
			
		}
		for(int i=0;i<max;i++) {
			sum += arr[i]; 
		}
		avg = (float)sum/max;
		System.out.println("the sum of elements is :"+ sum +" the average is: "+ avg  );
		num.close();
	}

}
