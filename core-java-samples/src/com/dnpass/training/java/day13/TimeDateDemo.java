package com.dnpass.training.java.day13;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;

public class TimeDateDemo {

	public static void main(String[] args) {
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

		LocalTime time = LocalTime.now();
		System.out.println();
		// in hour, minutes, seconds, nano seconds
		System.out.println("Local time now:" + time);
		time = LocalTime.now();
		// adding four hours

		LocalTime newTime = time.plusHours(4);
		System.out.println();

		System.out.println("Time after 4 hours:" + newTime);

		LocalDate today = LocalDate.now();
		LocalDate userday = LocalDate.of(2015, Month.MAY, 15);
		Period diff = Period.between(userday, today);
		System.out.println("\nDifference between " + userday + " and " + today + ": " + diff.getYears()
				+ " Year(s) and " + diff.getMonths() + " Month()s\n");

		Instant timestamp = Instant.now();
		System.out.println("\nCurrent Timestamp: " + timestamp + "\\n");

		today = LocalDate.now();
		System.out.println("\nCurrent Date: " + today);

		System.out.println("10 days before today will be " + today.plusDays(-10));
		System.out.println("10 days after today will be " + today.plusDays(20) + "\n");

		today = LocalDate.now();

		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		Period period = today.until(lastDayOfYear);
		System.out.println();
		System.out.println("Months remaining in the year: " + period.getMonths());

		// Current year
		Year yr = Year.now();
		System.out.println("\nCurrent Year: " + yr);

		boolean isLeap = yr.isLeap(); // false

		System.out.println("Is current year leap year? " + isLeap);
		int length = yr.length();
		System.out.println("Length of the year:" + length + "days\n");

		// information about the month
		LocalDate ldt = LocalDate.of(2016, Month.FEBRUARY, 10);

		Month mn = ldt.getMonth(); // FEBRUARY
		int mnIntValue = mn.getValue(); // 2

		int minLength = mn.minLength(); // 28
		int maxLength = mn.maxLength(); // 29

		Month firstMonthofQuarter = mn.firstMonthOfQuarter(); // JANUARY
		System.out.println("\nInteger value of the current month: " + mnIntValue);
		System.out.println("Length of the month: " + minLength);
		System.out.println("Maximum length of the month:" + maxLength);
		System.out.println("First month of the Quater: " + firstMonthofQuarter + "\n");
		time = LocalTime.of(12, 24, 32);

		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();

		System.out.println("\nCurrent Local time: " + time);
		System.out.println("Hour: " + hour);

		System.out.println("Hinute:" + minute);
		System.out.println("Second: " + second + "\n");

	}
}
