package com.dnpass.training.java.day13;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.YearMonth;

public class SnippetRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate l_date = LocalDate.now();
		System.out.println("Current date: " + l_date);
		LocalTime l_time = LocalTime.now();
		System.out.println("Current time:" + l_time);

		YearMonth ym = YearMonth.of(2016, 9);

		String firstDay = ym.atDay(1).getDayOfWeek().name();
		String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
		System.out.println();
		System.out.println(firstDay);
		System.out.println(lastDay);
		System.out.println();


	}

}
