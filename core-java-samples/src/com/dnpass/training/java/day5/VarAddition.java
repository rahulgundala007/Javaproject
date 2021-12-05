package com.dnpass.training.java.day5;

public class VarAddition {
	public void add(int ...values) {
		int sum=0;
		for(int value:values) {
			sum = sum+ value;
			System.out.println(value+"+"+sum+"="+sum);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarAddition num = new VarAddition();
		num.add(1,2,3,4,5,6);
		
	}

}
