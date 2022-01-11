package com.cares.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEx1 {

	Scanner sc;
	
	public void ex2() {
		// 주민번호 검증프로그램
		// 키보드로부터 주민등록번호 입력
		// 9  7  1  2  2  4 - 1  2  3  4  5  6  7
		// 2  3  4  5  6  7   8  9  2  3  4  5  마지막은 체크용 번호
		// 위랑 아래랑 곱하기
		// 18 21 4  10 12 28  8  18 6  12 20 30
		// 결과를 모두 더함 > 187
		
		// 2. 모두 더한 결과값을 11로 나누어서 나머지를 구함
		// 187/11 > 몫:17 / 나머지:0
		
		// 3. 11로 나눈 나머지값을 11에서 빼고 그 값이 체크용 번호랑 같은지 비교
		// 11 - 0 = 11
		
		// 4. 만약에 뺀 값이 두자리라면 결과값을 다시 10으로 나누어서 그 나머지 값을 체크용번호랑 같은지 비교
		// 11 / 10 = 1 ... 1 > 이걸 체크용 번호와 맞는지 비교
		// 맞으면 정상 / 틀리면 비정상
		sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력해주세요.");
		String number = sc.next();
		
		// 주민등록번호를 한자리씩 받을 배열 만들기
		int[] numArr = new int[14];
		
		// 배열 한칸당 숫자 하나씩 넣기
		for (int i=0;i<numArr.length;i++) {
			numArr[i] = Character.getNumericValue(number.charAt(i));
		}
		
		int sum = 0; // 합계 계산용
		int j = 2; // - 처리용
		
		for(int i=0;i<9;i++) { // 2 ~ 9까지
			if (i == 6) { // - 인경우에는 넘어가기
				j = 1;
				continue;
			}
			sum += numArr[i] * (i+j);
		}
		for(int i=0;i<4;i++) { // 다시 2로 돌아오기
			sum += numArr[i+9] * (i+2);
		}
		System.out.println(sum);
		
		int result = 11 - sum % 11;
		
		if (result == numArr[13]) { // 비교하기
			System.out.println("정상입니다");
		} else {
			System.out.println("비정상입니다");
		}	
	}
	
	public void ex1() {
		// 키보드로부터 주민등록번호 입력
		// 991224-1234567 뒷부분 첫자리에 따라 성별이 결정됨
		
		// 나이를 대충 계산
		// 남자 여자
		// 어느 계절에 태어났는지
		// 3-5 : 봄 / 6-8 : 여름 / 9-11 : 가을 / 12 - 3 : 겨율
		sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력해주세요.");
		String number = sc.next();
		
		// - 를 기준으로 앞, 뒤를 나눔 
		String [] numbers = number.split("-");
		// numbers[0] : 앞, numbers[1] : 뒤
		
		// 1900 년대 / 2000년대 구분하기
		int year = 0;
		// 뒷부분 1자리 구하기
		String backOneStr = numbers[1].substring(0, 1);
		int backOne = Integer.parseInt(backOneStr);
		
		if (backOne == 1 || backOne == 2) {
			year = 19;
		} else {
			year = 20;
		}
		
		// --- 나이계산 시작 ---		
		String frontTwo = numbers[0].substring(0, 2);
		
		StringBuffer ageStr = new StringBuffer();
		ageStr.append(Integer.toString(year));
		ageStr.append(frontTwo);
		
		int age = Integer.parseInt(ageStr.toString());
		System.out.println(2022-age+1);
		// --- 나이계산 끝 ---
		
		// --- 성별계산 시작 ---
		if (backOne == 1 || backOne == 3) {
			System.out.println("성별 : 남자");
		} else {
			System.out.println("성별 : 여자");
		}
		// --- 성별계산 끝 ---
		
		// --- 계절 ---
		String seasonStr = numbers[0].substring(2, 4);
		int season = Integer.parseInt(seasonStr);
		
		if (season >= 3 && season <= 5) {
			System.out.println("태어난 계절 : 봄");
		} else if (season >= 6 && season <= 8) {
			System.out.println("태어난 계절 : 여름");
		} else if (season >= 9 && season <= 11) {
			System.out.println("태어난 계절 : 가을");
		} else {
			System.out.println("태어난 계절 : 겨울");
		}
	}
}
