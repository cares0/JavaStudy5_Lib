package com.cares.s2.s4.calendar;

import java.util.Calendar;

public class CalendarStudy3 {

	public static void main(String[] args) {
		// 1초 = 1000ms
		// 1분 = 60초
		// 1시간 = 60분
		// 하루 = 24시간
		// 1년 = 365일
		// 1년 = 1000*60*60*24*365 ms > 1471228928
		
		// 현재시간
		Calendar ca = Calendar.getInstance();
		
		
		// 2시간 뒤 시간
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.HOUR_OF_DAY, 17);
		
		System.out.println(ca.getTime());
		System.out.println(ca2.getTime());
		
		
		// 둘간의 시간차를 구하려 함
		
		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		long result = l2 - l1;
		System.out.println(result);
		
		System.out.println(result/(1000*60*60));
		

	}

}
