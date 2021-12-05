package com.dnpass.training.java.day13;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class UtilDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year =2021;
		int month =9;
		int date =1;
		
		Calendar cal = Calendar.getInstance();
		System.out.println();
		System.out.println("year: "+ cal.get(Calendar.YEAR));
		System.out.println("Month: " + cal.get(Calendar.MONTH));
		System.out.println("Day: "+cal.get(Calendar.DATE));
		System.out.println("Hour: "+cal.get(Calendar.HOUR));
		System.out.println();
		
		cal.clear();
		System.out.println();
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DATE, date);
		System.out.println(cal.getTime());
		
		cal=Calendar.getInstance();
		System.out.println();
		System.out.println("\nCurrent Date and time :" +cal.getTime());
		int actualMaxYear = cal.getActualMaximum(Calendar.YEAR);
		int actualMaxMonth = cal.getActualMaximum(Calendar.MONTH);
		int actualMaxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
		int actualMaxDate = cal.getActualMaximum(Calendar.DATE);
		
		
		System.out.println("actual Max year: "+ actualMaxYear);
		System.out.println("Actual max month: "+ actualMaxMonth);
		System.out.println("Actual max week of year:"+ actualMaxWeek);
		System.out.println("actual max date: "+ actualMaxDate);
		
		//gets a calendar using the default time zone and locale
		
		Calendar calendar = Calendar.getInstance();
		System.out.println();
		System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println();
		
		
		//two weeks
		int noOfDays=14;
		cal=Calendar.getInstance();
		Date cdate= cal.getTime();
		cal.add(Calendar.DAY_OF_YEAR, noOfDays);
		Date date1= cal.getTime();
		System.out.println("\nCaurrent Date: "+ cdate +"\n");
		System.out.println("Day after two weeks: " + date1+ "\n");
		
		
		cal=Calendar.getInstance();
		cdate=cal.getTime();
		//get next year
		cal.add(Calendar.YEAR, 1);
		Date nyear = cal.getTime();
		//previous year
		cal.add(Calendar.YEAR, -2);
		Date pyear = cal.getTime();
		System.out.println("\nCurrent Date: "+cdate);
		System.out.println("\nDate before 1 year: "+pyear);
		System.out.println("\nDate after 1 year: "+nyear+"\n");
		
		//year is leap year or not
		year= 2020;
		System.out.println();
		if((year%400==0)||((year%4==0)&&(year%100!=0))) {
			System.out.println("year "+ year +" is a leap year");
		}
		else {
			System.out.println("year"+ year+ "is not a leap year");
		}
		
		cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		System.out.println("\n"+cal.getTime()+"\n");
		
		try {
			String originalString="2016-07-14 09:00:02";
			Date date12= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(originalString);
			SimpleDateFormat newstr = new SimpleDateFormat("MM/dd/yyyy, H:mm:ss");
		}catch(ParseException e){
			e.printStackTrace();
			
		}

		//Unix seconds


		long unixSeconds= 1372339860;

		//convert seconds to milliseconds
		Date date12 = new Date(unixSeconds* 1000L); // format of the date

	

		SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm: ss Z");
		jdf.setTimeZone(TimeZone.getTimeZone("GMT-4"));

		String java_date= jdf. format (date12);
		System.out.println("\n"+java_date+"\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
