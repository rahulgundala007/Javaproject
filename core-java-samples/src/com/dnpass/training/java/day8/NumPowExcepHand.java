package com.dnpass.training.java.day8;
import java.util.*;



public class NumPowExcepHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1:");
		int num1 = sc.nextInt();
		System.out.println("enter num2:");
		int num2 = sc.nextInt();
		checkNum powObj = new checkNum();
		try {
			powObj.power(num1, num2);
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}

class checkNum{
	void power(int num1,int num2) throws Exception{
		if(num1==0 && num2 ==0) {
			throw new Exception("n and p should not be zero");
		}else if(num1<0 ||num2 <0) {
			throw new Exception("n and p should not be negative");
		}else {
			System.out.println((int)Math.pow(num1,num2));
		}
	}
}
