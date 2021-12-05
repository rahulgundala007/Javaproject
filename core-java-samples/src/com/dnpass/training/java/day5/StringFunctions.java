package com.dnpass.training.java.day5;

public class StringFunctions {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("hello");
		sb.append(" world");
		sb.insert(0,"robo ");
		sb.replace(5, 7, "hi");
	
		System.out.println(sb);
	}

}
