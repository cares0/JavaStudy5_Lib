package com.cares.s1.lang.string.ex1;

public class MemberData {
	
	private String data;
	
	public MemberData() {
		this.data = "ID1 - PW1 - Name1 - ID1@gmail.com - ";
		this.data = this.data + "ID2 - PW2 - Name2 - Name2@naver.com - ";
		this.data = this.data + "ID3 - PW3 - Name3 - Name3@daum.net";
		System.out.println(this.data);
	}
	
	public MemberDTO [] init() {
		// this.data를 분리해서 MemberDTO의 값으로 대입
		String [] datas = this.data.split("-");
		MemberDTO [] members = new MemberDTO[3];
		
		int index = 0;
		
		for(int i=0;i<3;i++) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(datas[index]); // datas[0] > [4] > [8]
			memberDTO.setPw(datas[index = index + 1]); // datas[1] > [5] > [9]
			memberDTO.setName(datas[index = index + 1]); // datas[2] > [6] > [10]
			memberDTO.setEmail(datas[index = index + 1]); // datas[3] > [7] > [11]
			members [i] = memberDTO;
			index++;
		}
		return members;
		
	}

}

