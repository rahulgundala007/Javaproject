package com.dnpass.training.java.day3;



public class DisplayWeek {

	public static void main(String[] args) {
		int day = 2;

		switch (day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");

			break;
		case 4:
			System.out.println("Thursday");

			break;
		case 5:
			System.out.println("Friday");

			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("Invalid week");

			break;
		}

	}

}
