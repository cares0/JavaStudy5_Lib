package com.cares.s1.lang.stringBuffer;

public class StringBufferMain {

	public static void main(String[] args) {
		
		//StringBuffer sb = "aa"; // String타입이 아니기 때문에 이건 불가능
		StringBuffer sb = new StringBuffer();
		sb.append("aa");
		sb.append("bb"); // append를 하면 객체 하나를 더 만드는게 아니라 하나의 객체에 내용을 더하는 것임
		
		System.out.println(sb); // aabb
		// sb도 원래 참조변수기 때문에 주소가 나와야 하지만 
		// StringBuffer에서 toString이 오버라이딩 됐기 때문에 값이 나오는걸 볼 수가 있음
		
		String str1 = "aa";
		String str2 = "bb";
		str1 = str1 + str2;
		System.out.println(str1); // aabb
		// sb를 출력할 때와 값은 같지만, 객체차이가 2개나 남 (sb는 1개, String은 3개)
		// str1 = sb; // 이는 불가능, 둘이 값은 같지만 데이터 타입이 다름
		// sb의 데이터 타입은 StringBuffer 타입이기 때문에 String타입 변수 str1에는 당연히 대입이 불가능
		// StringBuffer랑 String은 서로 아예 관계가 없는 클래스들임

		str1 = sb.toString();
		// StringBuffet클래스에서는 toString메서드가 결국 String타입 데이터를 리턴하기 때문에 
		// 이렇게 toString 메서드를 호출해서 String타입 변수에 넣을 수 있음
		
	}

}
