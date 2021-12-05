package com.dnpass.training.java.day5;

public class MinAndMax {
	public int max(int[] arr) {
		int max =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}return max;
	}
	public int min(int[] arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArr = {10,34,56,43,60};
		MinAndMax m = new MinAndMax();
		System.out.println("the minimum no is:"+ m.min(myArr));
		System.out.println("the maximum no is:"+ m.max(myArr));
		

	}

}
