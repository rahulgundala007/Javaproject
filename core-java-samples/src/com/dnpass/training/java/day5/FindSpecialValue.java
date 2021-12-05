package com.dnpass.training.java.day5;    //find special char and index programs
import java.util.*;
public class FindSpecialValue {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = {1,2,3,4,5};
		boolean found =false;
		System.out.println("enter the value to search");
		int toFind = sc.nextInt();
		
		for(int n: num) {
			if(n == toFind) {
			
				found = true;
				System.out.println("the index is "+ (n-1));
				break;
			}
		}
		if(found) {
			System.out.println(toFind+" is found");
		}else {
			System.out.println(toFind+" is not found");
		}
		sc.close();

	}

}
