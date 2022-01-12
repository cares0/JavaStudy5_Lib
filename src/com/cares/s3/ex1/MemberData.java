package com.cares.s3.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberData {
	
	private String data;
	
	public MemberData() {
		this.data = "ID1 - PW1 - Name1 - ID1@gmail.com - 10 - ";
		this.data = this.data + "ID2 - PW2 - Name2 - Name2@naver.com - 20 - ";
		this.data = this.data + "ID3 - PW3 - Name3 - Name3@daum.net - 30";
		System.out.println(this.data);
	}
	
	public ArrayList<MemberDTO> init() {
		// data에 있는 문자열을 StringTokenizer로 파싱해서
		// MemberDTO를 생성해서 멤버변수값으로 대입
		// 만들어진 MemberDTO를 ArrayList에 담아서 리턴
		
		StringTokenizer st = new StringTokenizer(data, " - ");
		ArrayList<MemberDTO> ar = new ArrayList<>();
		
		while (st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(st.nextToken());
			memberDTO.setPw(st.nextToken());
			memberDTO.setName(st.nextToken());
			memberDTO.setEmail(st.nextToken());
			memberDTO.setAge(Integer.parseInt(st.nextToken()));
			ar.add(memberDTO);
		}
		return ar;
	}

}

