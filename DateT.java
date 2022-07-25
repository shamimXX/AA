package com.shamim.Date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		
		Calendar c= Calendar.getInstance();
		System.out.println(c.getCalendarType());
		System.out.println(c.getTimeZone().getID());
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String form=ld.format(dtf);
		System.out.println(form);

	}

}
