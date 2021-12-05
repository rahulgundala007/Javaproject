package com.dnpass.training.java.day3;

public class SumOfEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;int sum=0;
		for(i=1;i<101;i++) {
			if(i%2==0) {
				sum=sum+i;
				
			}
		}
		System.out.println(sum);	
		

	}

}
