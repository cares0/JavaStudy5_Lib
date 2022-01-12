package com.cares.s2.util.collenction;

import java.util.ArrayList;

public class ListStudy {

	public void study3() {

		// ArrayList<E> 변수명 = new ArrayList<E>();
		// E = Integer
		ArrayList<Integer> ar2 = new ArrayList<>(); // 뒤 <>는 항상 처음에 선언한 데이터가 들어가야 하기에 생략 가능
		// ar2라는 ArrayList 객체는 Integer 타입을 모아놓겠다는 소리이다.
		// 그래서 ar2.add를 하면 에디터에서 Integer타입을 넣으라고 표시를 해준다.		
		
		
		//
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		// 타입이 보장이 안되기 때문에 어느 타입이 들어가는지 모름
		// 이 ArrayList에는 int 타입만을 모아놨으니까 
		// 나중에 꺼낼 때 int 타입으로 사용하라는 뜻
		// Reference타입만 선언 가능
		ar.add(1); // int 타입만 가능, 다른 데이터 못넣음
		ar.add(2); 
		ar.add(3); 
		ar.add(4); 
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));			
		} // 정상적으로 출력이 잘 됨
		
//		int num = (int) ar.get(0); // error
//		String name = (String) ar.get(3); // error
		// 컴파일 자체가 안됨
		
		Object obj = 1; // Autoboxing으로 인해 int 1을 Integer로 바꾸고 그것을 Object에 넣을 수 있음
		// int n = obj; // 모든 Object가 Integer가 아니기 때문에 이것이 Integer라는 것을 확정시켜 줘야함
		
		int num = (int) ar.get(0); 

		// 따라서 그렇게 해줘야 함
		// 배열의 경우에는 int [] 이면 배열의 값이 int타입이라는 것이 확실하기 때문에
		// int 타입의 변수에 넣을 수가 있었다.
		// 근데 ArrayList의 경우에는 Object타입이 들어가기 때문에 모든 타입이 가능하다.
		// 즉, 이게 int타입의 데이터인지 확정을 해줄 수가 없다는 것이다.
		// 그래서 데이터를 다른 변수에 대입할 때 타입이 뭔지를 확정을 시켜주어야 한다.
		
	}
	
	
	public void study2() {
		ArrayList ar = new ArrayList();
		ar.add(1); // E에는 Object를 담으라고 하는데 1은 primitive라 Object가 아닌데 들어감
		// 그래서 원래는 Integer n; 을 넣어야 함
		// 근데 AutoBoxing이 되었기 때문에 자동으로 primitive 1을 Integer타입 1으로 바꿔줌
		
		
	}
	
	
	
	public void study1() {
		
		int [] numbers = new int [2]; // int형 데이터를 담는 2칸짜리 배열
		ArrayList ar = new ArrayList(); // 기본은 10칸인 ArrayList
		
		// 배열에 대입
		numbers [0] = 1;
		numbers [1] = 2; // 2칸짜리 배열이라 더이상 대입 불가능
		
		// ArrayList에 대입
		ar.add(1);
		ar.add(2);
		ar.add(3); // ... 내가 원하는 만큼 데이터를 넣을 수 있음, 알아서 칸이 늘어남
		ar.add(1, 100);
		ar.set(0, 200);
		ar.remove(1);
		ar.clear();
		
		
		System.out.println(numbers[0]);

		
		for(int i=0;i<numbers.length;i++) { // 배열
			System.out.println(numbers[i]);
		}
		
		for(int i=0;i<ar.size();i++) { // ArrayList
			System.out.println(ar.get(i));
		}
		
		
	
	}
	
}
