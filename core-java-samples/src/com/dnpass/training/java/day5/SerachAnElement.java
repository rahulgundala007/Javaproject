package com.dnpass.training.java.day5;

public class SerachAnElement {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 56;
		int[] arr = { 2, 4, 6, 56, 43 };
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				System.out.println(num + " is in the location " + i);

			}

		}

	}
}
