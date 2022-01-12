package com.cares.s3.ex1;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {

		MemberData memberData = new MemberData();
		
		ArrayList<MemberDTO> ar = new ArrayList<>();
		
		ar = memberData.init();

		for(int i=0;i<ar.size();i++) {
			System.out.println("ID : " + ar.get(i).getId());
			System.out.println("PW : " + ar.get(i).getPw());
			System.out.println("Name : " + ar.get(i).getName());
			System.out.println("Email : " + ar.get(i).getEmail());
			System.out.println("Age : " + ar.get(i).getAge());
			
			
			
		}
	}
}
