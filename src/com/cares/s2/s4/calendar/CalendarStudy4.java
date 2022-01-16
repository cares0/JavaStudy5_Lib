package com.cares.s2.s4.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarStudy4 {

	public static void main(String[] args) {

		// 현재 시간
		Calendar ca = Calendar.getInstance();

		// 태어난 날
		Calendar ca2 = Calendar.getInstance();
		ca2.set(2000, 0, 14);

		// 차이 계산
		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();		
		long result = l1 - l2;
		
		// 며칠
		System.out.println(result/(1000*60*60*24));		
		// 나이
		System.out.println(result/(1000*60*60*24*365.2425));
		
	}

}
