package com.cares.s1.lang.string;

import java.util.Scanner;

public class StringStudy1 {

	public void splitTest() {
		String name = "iu, suji, choa, 펭수, 춘식이";
		
		String [] arr = name.split(", ");
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void valueTest() {
		int num = 1000;
		System.out.println(String.valueOf(num));
						
	}
	
	
	public void caseTest() {
		String title = "West Side Story";
		System.out.println(title.toLowerCase());
	}
	
	public void replaceTest() {
		String title = "West Side Story";		
		System.out.println(title.replace("Side", "side")); // West side story
	}
	
	
	public void subStringEx1() {
		// 키보드로부터 업로드할 파일명을 입력
		// ex) a.txt, b.pdf, c.jpg
		// jpg, gif, png -> 이미지 파일입니다 출력
		// txt, pdf, hwp -> 문서 파일입니다 출력
		// mp3, wav, ogg -> 음원 파일입니다 출력
		// 나머지는 알 수 없는 파일입니다 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("업로드할 파일명을 입력하세요.");
		String fileName = sc.next();
		
		if (fileName.indexOf("jpg") >= 0 || fileName.indexOf("gif")>= 0 || fileName.indexOf("png") >= 0) {
			System.out.println("이미지 파일입니다.");
		} else if (fileName.indexOf("txt") >= 0 || fileName.indexOf("pdf")>= 0 || fileName.indexOf("hwp") >= 0) {
			System.out.println("문서 파일입니다.");
		} else if (fileName.indexOf("mp3") >= 0 || fileName.indexOf("wav")>= 0 || fileName.indexOf("ogg") >= 0) {
			System.out.println("음원 파일입니다.");
		} else {
			System.out.println("알 수 없는 파일입니다.");
		}	
	}
	
	public void s() {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 입력");
		String fileName = sc.next();
		String result = fileName.substring(fileName.lastIndexOf(".")+1); // 확장자명 추출하기
		
		if(result.equals("jpg") || result.equals("gif") || result.equals("png")) {
			System.out.println("이미지 파일입니다.");
		} else if (result.equals("txt") || result.equals("pdf") || result.equals("hwp")) {
			System.out.println("문서 파일입니다.");
		} else if (result.equals("mp3") || result.equals("wav") || result.equals("ogg")) {
			System.out.println("음원 파일입니다.");
		} else {
			System.out.println("알 수 없는 파일입니다.");
		}
		
	}
	
	
	public void subStringTest() {
		String title = "West Side Story";
		String str = title.substring(title.indexOf('S'), title.indexOf('S', title.indexOf('S')+1));
		System.out.println(str);
	}
	
	
	public void lengthtest() {
		String title = "West Side Story";
		int len = title.length();
		System.out.println(len); // 15반환

		// title에 몇개의 find가 들어가있는지 출력
		String find = "S";
		
		int count = 0;
		for(int i=0;i<title.length();i++) {
			if (title.charAt(i) == find.charAt(0)) {
				count += 1;
			}
		}
		System.out.println(count);
		
//		String find = "S";
//		
//		int count = 0;
		
		for(int i=0;i<title.length();i++) {
			int index = title.indexOf(find, i);
			if(index >= 0) {
				count++;
				i=index;
			} else {
				break;
			}
		}
		System.out.println(count);
		
		
		
		// 한글자씩 출력
		// W
		// e
		// s
		// d
		
		for (int i=0;i<title.length();i++) {
			System.out.println(title.charAt(i));
		}
		
		
		
	}
	
	public void indexOfTest() {
		String msg = "Hello World";
		int num = msg.indexOf('o', 5);
		System.out.println(num); // 7
	}
	
	public void equalTest() {
		String str = "aa";
		String str2 = "aa";
		String str3 = new String("aa");
		String str4 = new String("aa");
		
		System.out.println(str == str2); // true
		System.out.println(str3 == str4); // false
		System.out.println(str == str3); // false
		
		System.out.println(str.equals(str2)); // true
		System.out.println(str3.equals(str4)); // true
		System.out.println(str.equals(str3)); // true
	}
	
	public void study1() {
		String name = "hello";
		String name2 = new String("hello"); // 원래는 이런 형식
		// 하지만 자바에서 워낙 많이 쓰이기에 위의 경우도 허용
		
		System.out.println(name.charAt(0));
		
		System.out.println(name);
		// 원래 name은 참조변수 (데이터타입 변수명 < 주소를 담고있는 참조변수임)
		// 근데 참조변수를 출력하면 toString 메서드가 호출된다고 했음
		// 그래서 주소를 문자열로 바꿔서 출력해주게 됨
		// 따라서 원래는 name 참조변수에 저장된 String클래스의 주소를 출력해줘야 함
		// 근데, String클래스에서 toString메서드를 오버라이딩했기 때문에
		// String 데이터를 toString하게 되면 글자가 출력되게 된 것임
	}
}
