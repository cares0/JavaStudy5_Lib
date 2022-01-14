package com.cares.s2.s4.calendar;

import java.util.Calendar;

public class CalendarStudy2 {

	public static void main(String[] args) {
		// 현재 시간
		Calendar ca1 = Calendar.getInstance();
		System.out.println(ca1.getTime());
		
		// 시간 설정
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.YEAR, 2023);
		ca2.set(Calendar.MONTH, 1);
		ca2.set(Calendar.DATE, 15);
		System.out.println(ca2.getTime());
		
	
	
	}

}
