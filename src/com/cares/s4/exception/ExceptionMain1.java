package com.cares.s4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 10;
		
		System.out.println("나이를 입력");
		try {
			int age = sc.nextInt();	
			System.out.println("Age : " + age);
			// throw new InputMismatchException
			
			int result = num/age; // 0
			// throw new ArithmeticException
			
		} catch(InputMismatchException exception) {
			System.out.println("숫자만 입력하세요");			
		} catch(ArithmeticException exception) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception exception) {
			System.out.println("알수없는 예외 발생");
			exception.printStackTrace(); // 어떤 예외인지 출력
		} catch(Throwable exception) {
			System.out.println("모든 예외는 여기서 처리");
		}
	}

}
