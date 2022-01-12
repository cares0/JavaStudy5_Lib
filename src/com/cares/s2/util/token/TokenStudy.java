package com.cares.s2.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String str = "봄,16,여름,32,가을,20,겨울,-15";
		
		String [] s = str.split(",");
		
		
		StringTokenizer st = new StringTokenizer(str, ",");
		// 어떤 String을 어떤 기준으로 자를 것이냐
		
		
		ArrayList<SeasonDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			SeasonDTO seasonDTO = new SeasonDTO();
			String token = st.nextToken();
			seasonDTO.setName(token); // 봄
			
			token = st.nextToken(); // 16
			seasonDTO.setAvgTemp(Integer.parseInt(token));
			// 내가 원하는 만큼 잘라서 원하는 데이터에 넣을 수 있다.
			// split을 사용하면 인덱스를 기억해서 막 작업해야하지만 이건 그러지 않아도 된다.
			
			ar.add(seasonDTO);
			
		}
		for(int i=0;i<ar.size();i++) {
			SeasonDTO seasonDTO = ar.get(i);
			System.out.println(seasonDTO.getName());
			System.out.println(seasonDTO.getAvgTemp());
		}
		
		
		while(st.hasMoreTokens()) { 
			// 자를 토큰이 더 있읍니까? 있으면 true, 없으면 false
			// 처음 봄부터 시작 > ,를 찾음 다음으로 넘어감 > 자를 토큰이 더 있음 > true 리턴 
			// > 여름을 찾음 > 다음으로 넘어감 > ,를 찾음 > 자를 토큰이 더 있음 > true 리턴
			// ...... 겨울을 찾음 > 끝을 만남 > false를 리턴
			
			String token = st.nextToken(); // 토큰을 자르면 다음 토큰을 주세요 하는 것
			// while안에 넣어놨기 때문에 끝을 만날 때 까지 Token을 잘라서 줌
			System.out.println(token.trim());
		}
		
		StringTokenizer st2 = new StringTokenizer(str);
		
		while(st2.hasMoreTokens()) {
			String token = st.nextToken(",");
			// 만약 객체를 생성할 때 자를 기준을 인자값으로 주지 않았다면 nextToken 메서드에서 인자값으로 주면 됨
		}
		
		
	}
	
}
