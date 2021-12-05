package com.dnpass.training.java.day5;
import java.util.*;
public class StringRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner str = new Scanner(System.in);
		System.out.println("enter the string:");
		String str1 = str.nextLine();
		System.out.println("enter the value start");
		int from = str.nextInt();
		System.out.println("enter the value end");
		int to = str.nextInt();
		System.out.println(str1.substring(from, to));
		str.close();
	}

}
