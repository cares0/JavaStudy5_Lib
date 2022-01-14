package com.cares.s2.s4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {
		// Calendar 클래스는 추상클래스, 상속해서 써야 함
		// GregorianCalendar가 이를 상속받아 메서드들을 오버라이딩 하고 있음
		// 즉, Calendar 클래스에 있는 메서드는 전부 GregorianCalendar에도 있음
		
		GregorianCalendar gc = new GregorianCalendar();
		
		Calendar calendar = new GregorianCalendar(); 
		// 그냥 Calendar는 추상클래스라 객체를 만들지 못하니까
		// 다형성에 의해 GregorianCalendar의 객체도 넣을 수 있기 때문에 가능
		// 차이점은 calendar의 경우에는 부모가 알고 있는 메서드만 사용 가능
		
		Calendar calendar2 = Calendar.getInstance();
		// 이것도 가능, Calendar 클래스의 클래스메서드 getInstance를 사용하면 
		// GregorianCalendar를 리턴해줌. 사실상 위의 코드랑 같음
		
		
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		int month = calendar.get(Calendar.MONTH);
		System.out.println(month);
		int day = calendar.get(Calendar.DATE);
		System.out.println(day);
		int hour = calendar.get(Calendar.HOUR);
		int hour2 = calendar.get(Calendar.HOUR_OF_DAY); // 24시간 형식으로 쓸 때
		System.out.println(hour);
		System.out.println(hour2);
		int min = calendar.get(Calendar.MINUTE);
		System.out.println(min);
		int sec = calendar.get(Calendar.SECOND);
		System.out.println(sec);
		
		// 1000ms = 1sec
		int ms = calendar.get(Calendar.MILLISECOND);
		System.out.println(ms);
		
		long millisec = calendar.getTimeInMillis();		
		System.out.println(millisec);

		Date date = calendar.getTime();		
		System.out.println(date);
		
		
	}

}
