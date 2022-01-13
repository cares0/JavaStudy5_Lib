package com.cares.s3.ex1.member;

import java.util.ArrayList;

import com.cares.s2.util.collenction.MapStudy;
import com.cares.s2.util.collenction.SetStudy;

public class MemberMain {


	
	public static void main(String[] args) {

		
		MemberData memberData = new MemberData();
		
		ArrayList<MemberDTO> ar = new ArrayList<>();
		
		ar = memberData.init();

		
		
		
		memberData.addMember(ar);
		
		MemberDTO memberDTO = memberData.removeMemberAnswer(ar);
		if(memberDTO != null) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
		
		// memberData.removeMember(ar);
		
		
		
		
		for(int i=0;i<ar.size();i++) {
			System.out.println("ID : " + ar.get(i).getId());
			System.out.println("PW : " + ar.get(i).getPw());
			System.out.println("Name : " + ar.get(i).getName());
			System.out.println("Email : " + ar.get(i).getEmail());
			System.out.println("Age : " + ar.get(i).getAge());						
			System.out.println("======================");
		}
	}
}
