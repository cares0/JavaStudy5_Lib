package com.cares.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperAnswer {


	Scanner sc;

	public WrapperAnswer() { // 객체를 어쨌든 한번은 만드니까
		this.sc = new Scanner(System.in);
	}

	public void ex1() {
		System.out.println("주민등록번호를 입력해주세요.");
		String jumin = sc.next();
		// 입력된 데이터가 내가 원하는 형식과 같은지를 확인, jumin은 변수이기 때문에 값이 잘 들어오는지를 확인
		// System.out.println(jumin); // Test, 이게 잘못나오면 밑에 코드를 만들어 봤자임
		// jumin = "970630-1122345"; // 아니면 이렇게 내가 원하는 샘플데이터를 대입해 놓은다음에
		// 프로그램을 만들고 잘 됐는데, 샘플데이터를 지우고 실행을 했더니 안된다
		// 그러면 입력이 잘못들어오는구나를 생각해야함.


		// 1. 나이 계산
		int age = 0; 

		// 나이 = 이번년도(안바뀜 : 상수) - 출생년도(바뀜 : 변수)
		int year = 0;

		// ---- 연도 파싱 ----
		// 출생년도 = 주민번호 앞자리 2개임
		// 문자 2글자를 꺼내와야 함 > charAt을 사용하면 문자 1개를 반환하기에 작업을 2번해줘야 해서 비효율
		// 심지어 문자 2개를 더한다고 해도 int형으로 저장하면 char숫자타입은 int로 바꾸면 아스키코드로 바뀌기 때문에
		// 작업할 부분이 너무 많아짐

		/* 일단 한번 charAt으로 만들어 보는 것임 - 이것도 가능하긴 함
		 * char ch1 = jumin.charAt(0);
		 * char ch2 = jumin.charAt(1);
		 * String s = "" + ch1 + ch2;
		 * 근데 너무 비효율적인 것이 느껴짐 
		 */

		String y = jumin.substring(0,2);
		year = Integer.parseInt(y);
		// System.out.println(year+1); // Test, 잘 나오는지 확인
		// 이게 훨씬 효율적임
		// ---- 연도 파싱 끝 ----

		// ---- 성별 및 19/20년도 확인용 파싱 ----
		// 주민 뒷부분의 첫자리를 파싱해야함
		// jumin.substring(7,8); > 결과물 String
		// jumin.charAt(7); > 결과물 char

		String s = jumin.substring(7,8);
		char ss = jumin.charAt(7);

		// if (s.equals("1") || s.equals("2")) > 1900년대 // substring을 썼을 경우		
		// if (ss == '3' || ss =='4') // > 2000년대 // charAt을 썼을 경우

		int preYear = 2000;
		if (ss == '1' || ss =='2') {
			preYear = 1900;
		}
		year = preYear + year;

		age = 2022 - year;

		System.out.println("나이 : " + age); // 우선 나이를 출력할 것이기 때문에 결과를 먼저 작성해놓음
		// 이거 코드 순서상 맨 아래있긴 한데 int age를 선언할 때 같이 만들어 놓은 코드임

		// -- 성별 출력 시작 --
		String se = "Woman"; // if else를 써도 되고, 경우가 2개라면 초기값으로 하나 줘서 if하나만 줘도 됨
		if(ss == '1' || ss == '3') {
			se = "Man";
		}
		// 홀수면 남자, 짝수면 여자 이런식으로도 판단 가능
		/* if (ss%2 == 1) {
		 *	se = "Man";}
		 */
		System.out.println("성별 : " + se);
		// -- 성별 출력 끝 --

		// -- 계절 출력 시작 --

		int season = Integer.parseInt(jumin.substring(2,4));

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

	public void ex2() {
		System.out.println("주민등록번호를 입력하세요.");
		String jumin = sc.next();
		// 한글자씩 꺼내오는게 좋아보임
		// String result = jumin.substring(0,1); // 이런식으로 꺼내와야 겠구나 설계
		// System.out.println(result); // 잘 파싱하는지 확인

		int source = 2;
		int sum = 0;

		for (int i=0;i<jumin.length()-1;i++) { // 파싱을 문자열 길이만큼 해야하니까 반복문 사용
			String result = jumin.substring(i, i+1);
			// System.out.println(Integer.parseInt(result)); // 잘 파싱하는지 확인
			// - 를 숫자로 바꾸려다보니까 NumberFormatException이 뜸
			if (!result.equals("-")) { // -와 같지 않다면 숫자로 바꿔라
				int num = Integer.parseInt(result);
				sum = sum + num * source;
				source++;
				if(source>9) {
					source = 2;
				}
			}
		} // for 끝
		sum = sum % 11; // 합산된 결과값은 밑에서 사용하지 않기 때문에 sum 재사용
		sum = 11-sum;
		if (sum > 9) {
			sum = sum%10;
		}

		if (sum == Integer.parseInt(String.valueOf(jumin.charAt(13)))) {
			System.out.println("정상입니다.");
		} else {
			System.out.println("비정상입니다.");
		}

		/* chatAt을 사용하는 방법
		 * for(int i=0;i<jumin.length();i++) {
		 *	char ch = jumin.charAt(i);
		 *	if (ch != '-') {
		 *		int num = Integer.parseInt(String.valueOf(ch));				
		 *	}
		 */

	}

}

