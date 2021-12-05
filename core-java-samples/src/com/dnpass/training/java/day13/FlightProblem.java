package com.dnpass.training.java.day13;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

//The following code, from the Flight example, defines the departure time for a 
//flight from San Francisco to Tokyo as a Zoned DateTime in the America/Los 
// Angeles time zone. The withZoneSame Instant and plusMinutes methods are used
//to create an instance of ZonedDateTime that represents the projected arrival 
// time in Tokyo, after the 650 minute flight. The Zone Rules.isDaylightSavings 
// method determines whether it is daylight saving time when the flight arrives 
//in Tokyo.

public class FlightProblem {
	
	
	public static void main(String[] args) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern ("MMM d yyyyhh:mm a");
		// Leaving from San Francisco on July 20, 2013, at 7:30 p.m.
		LocalDateTime leaving =LocalDateTime.of(2013, Month.JULY, 20, 19, 30);
		ZoneId leavingZone =ZoneId.of("America/Los_Angeles");
		ZonedDateTime departure = ZonedDateTime.of(leaving,leavingZone);
		try { 
			String out1= departure.format(format);
			System.out.printf("LEAVING: %s (%s) %n", out1, leavingZone); 
		} catch (DateTimeException exc) {
			System.out.printf("%s can't be formatted! %n", departure);
			throw exc; 
		}

		// Flight is 10 hours and 50 minutes, or 650 minutes 
		ZoneId arrivingZone =ZoneId.of("Asia/Tokyo"); 
		ZonedDateTime arrival = departure.withZoneSameInstant (arrivingZone).plusMinutes (650);

		try {
			String out2 = arrival.format(format);
			System.out.printf("ARRIVING: %s (%s) %n", out2, arrivingZone); 
		}catch (DateTimeException exc) {
			System.out.printf("%s can't be formatted 1%n", arrival);
			throw exc;
		}
		
		if (arrivingZone.getRules ().isDaylightSavings (arrival.toInstant()))
			System.out.printf(" (%s daylight saving time will be in effect. ) %n", arrivingZone); 
		else
			System.out.printf(" (%s standard time will be in effect.) %n", arrivingZone);

			// Find the last Thursday in july 2013
			
		
			LocalDateTime localDate = LocalDateTime.of(2013, Month.JULY, 20,19, 30);
	
			ZoneOffset offset= ZoneOffset.of("-08:00");
			
			OffsetDateTime offsetDate = OffsetDateTime.of(localDate, offset);
			OffsetDateTime lastThursday = offsetDate.with (TemporalAdjusters.lastInMonth(DayOfWeek.THURSDAY)); 
			System.out.printf("The last Thursday in July 2013 is the %sth.%n", lastThursday.getDayOfMonth());

			// is useful for generating a time stamp to represent machine time.

			Instant timestamp= Instant.now();

			Instant oneHourLater = Instant. now().plus (1, ChronoUnit.HOURS);

			// how many seconds have occurred since the beginning of the Java Epoch.

			long secondsFromEpoch = Instant.ofEpochSecond(0L). until (Instant.now(), ChronoUnit. SECONDS);

			LocalDateTime ldt = LocalDateTime.ofInstant (timestamp, ZoneId.systemDefault()); 
			System.out.printf("%s %d %d at %d: %d %n", ldt.getMonth(), ldt.getDayOfMonth(), ldt.getYear(), ldt.getHour (), ldt.getMinute());

			
		
	}

}
