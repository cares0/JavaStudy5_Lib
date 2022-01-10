package com.cares.s1.lang.object;

public class ObjectMain {

	public static void main(String[] args) {
		
		ObjectStudy1 os = new ObjectStudy1();
		
		os.study1();
		
		Car car = new Car();
		System.out.println(car);
		
		Object obj = car;
	}

}
