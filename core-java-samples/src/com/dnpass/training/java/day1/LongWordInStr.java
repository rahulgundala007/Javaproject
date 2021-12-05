package com.dnpass.training.java.day1;
import java.util.Scanner;

public class LongWordInStr {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word or sentence:");
		String str = sc.nextLine();

		str += " "; // Add space at end of string
		String word = "", lWord = "";
		int len = str.length();

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {

				if (word.length() > lWord.length())
					lWord = word;

				word = "";
			} else {
				word += ch;
			}
		}

		System.out.println("The longest word: " + lWord + ": The length of the word: " + lWord.length());
		sc.close();
	}
	

}

