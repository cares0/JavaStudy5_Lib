package com.cares.s1.lang.object;

public class ObjectStudy1 extends Object{

	public void study1() {
		System.out.println("Study 1 실행");
		
		// Object 객체를 생성하고 주소출력
		Object obj = new Object();
		System.out.println(obj);
		
		// hashcode 메서드 호출
		int num = obj.hashCode();
		System.out.println(num);
		
		// toString 메서드 호출
		String str = obj.toString();
		System.out.println(str);
				
	}

}
