package com.cares.s2.util.collenction;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetStudy {
	
	public void study4() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(5);
		hs.add(6);
		hs.add(7);
		System.out.println(hs);
		
		// Iterator 에는 사이즈가 없음
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) { // 다음 요소가 있는지 물어봄
			int num = it.next();
			System.out.println(num);			
		}		
	}
	
	
	public void study3() {
		Random random = new Random();
		HashSet<Integer> hs = new HashSet<>();
				
		while(hs.size() <= 6) {
			int num = random.nextInt(45) + 1;
			System.out.println(num); // 확인용
			hs.add(num);			
		}		
		System.out.println(hs);
	}
	

	public void study2() {
		// Random
		Random random = new Random();
		// Lotto 번호를 랜덤 1-45 6개를 모두 뽑고 list에 담아서
		
		ArrayList<Integer> ar = new ArrayList<>();
		
		for (int i=0;i<6;i++) {			
			int num = random.nextInt(45) + 1;
			ar.add(num);
		}
		// 한꺼번에 출력
		System.out.println(ar);
	}
	
	public void study1() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		hs.add(1);
		
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100);
				
		System.out.println(hs);
		System.out.println(ar);
	}
	
}
