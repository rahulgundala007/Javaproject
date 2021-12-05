package com.dnpass.training.java.day4;
import java.util.*;

public class MidOfStr {
	String str;

	public void midChar() {
		Scanner str1 = new Scanner(System.in);
		System.out.println("enter:");
		String str = str1.nextLine();

		int len = str.length();
		if (len % 2 == 0) {

			System.out.println(str.charAt((len / 2) - 1) + " and " + str.charAt(len / 2));

		} else {
			System.out.println(str.charAt(len / 2));
		}
		str1.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MidOfStr midOfStr1 = new MidOfStr();
		// Scanner str1 = new Scanner(System.in);
		// System.out.println("enter:");
		// String str =str1.nextLine();
		midOfStr1.midChar();

	}

}
