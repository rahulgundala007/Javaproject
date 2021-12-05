package com.dnpass.training.java.day13;
import java.text.DateFormatSymbols;

import java.util.Locale;
public class FrenchWeeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormatSymbols symbols= new DateFormatSymbols(new Locale("de"));
		String[] monthNames= symbols.getMonths();
		
		for (String s : monthNames) {
			System.out.println(s +"\n");
			
		}
	}

}
