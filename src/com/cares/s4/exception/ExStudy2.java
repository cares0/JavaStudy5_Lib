package com.cares.s4.exception;

public class ExStudy2 {


	public void ex1() {
		// 유치원생 - 2자리수까지 읽기 가능
		int num = 70;
		int num2 = 50;
		int num3 = num + num2;
		int num4 = num - num2;

		try {
			if(num3 > 99) {
				throw new ChildException("3자리수 입력 불가");
			}
		}catch(ChildException childException) {
			childException.printStackTrace();
			System.out.println("Message : " + childException.getMessage());
		}

	}

}
