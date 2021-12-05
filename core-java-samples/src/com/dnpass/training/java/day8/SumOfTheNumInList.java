package com.dnpass.training.java.day8;

import java.util.Arrays;
import java.util.List;



public class SumOfTheNumInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;double sum1=0;
		List<Integer> li = Arrays.asList(1,4,3);
		for(int i : li) {
			sum += i;
			
			
		}
		System.out.println("the sum in the list of integer "+ sum  );
		
		
		List<Double> id = Arrays.asList(1.20,2.40,3.60);
		
		for(Double j : id) {
			sum1 += j;
		}
		System.out.println("the sum in the list Double "+ sum1);
		
		
		
	}

	

}
