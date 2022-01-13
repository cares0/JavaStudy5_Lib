package com.cares.s2.util.collenction;

import java.util.HashMap;

public class MapStudy {

	
	public void study1() {
		// HashMap
		HashMap<String, Integer> map = new HashMap<>();
		
		// put
		map.put("f1", 1);
		map.put("f2", 2);
		map.put("f3", 3);
		
		System.out.println(map);
		
		// 없는 키로 꺼내면
		Integer n = map.get("test");
		System.out.println(n);
		
		
		
		Integer num = map.remove("f2");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		
		
		
		
	}
}
