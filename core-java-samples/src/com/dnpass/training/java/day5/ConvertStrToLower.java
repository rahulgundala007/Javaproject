package com.dnpass.training.java.day5;
import java.util.*;

public class ConvertStrToLower {
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("enter the string:");
		String line = str.nextLine();

		System.out.println(line.toLowerCase());
		str.close();

	}
}