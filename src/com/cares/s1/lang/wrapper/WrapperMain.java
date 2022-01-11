package com.cares.s1.lang.wrapper;

public class WrapperMain {

	public static void main(String[] args) {
		System.out.println(Integer.BYTES); // int가 차지하는 byte -> 4
		System.out.println(Integer.MAX_VALUE); // int가 가질 수 있는 최대값
		System.out.println(Integer.MIN_VALUE); // int가 가질 수 있는 최소값
		System.out.println(Integer.SIZE); // 1byte : 8bit -> 32
		System.out.println(Integer.TYPE); // int
		// 원래 자바는 Object 언어이기 때문에 Integer클래스를 보고 primitive타입 int가 나온 것임

	

	
	int num = 10;
	
	Integer n = Integer.valueOf(num); // Integer객체 생성하기
	// n은 참조변수(Integer타입 객체의 주소를 담고 있음)
	
	n = num; // 근데 이게 됨 > autoboxing
	
	num = n; // 원래는 안되는데 이게 됨 > autounboxing
	
	num = n.intValue(); // Integer객체를 primitive int로 바꾸기
	
	System.out.println(n);
	
	double d = 3.14;
	Double dd = d;
	
	//Integer num2 = d; // 오토박싱과 오토언박싱은 같은 데이터티입끼리만 됨
	//Integer num2 = (int) d; // 이건 됨
	
	//int n2 = (int) dd; // 이건 안됨
	// 참조타입 > 원시타입은 안됨
	// 원시타입 > 참조타입은 오토박싱이 됨
			
	}
}
