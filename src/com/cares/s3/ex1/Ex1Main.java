package com.cares.s3.ex1;

import java.util.ArrayList;
import java.util.HashMap;

import com.cares.s3.ex1.member.MemberDTO;
import com.cares.s3.ex1.member.MemberData;
import com.cares.s3.ex1.student.StudentDTO;
import com.cares.s3.ex1.student.StudentData;

public class Ex1Main {

	public static void main(String[] args) {
		MemberData memberData = new MemberData();
		StudentData studentData = new StudentData();		
		
		// 회원들의 정보 모음
		ArrayList<MemberDTO> ar = memberData.init();
		HashMap<String, StudentDTO> map = (HashMap) studentData.addStudent(ar);		
		
		for(int i=0;i<map.size();i++) {
			StudentDTO stu = new StudentDTO();
			stu = map.get(ar.get(i).getId());
			
			System.out.println("ID : " + stu.getId());
			System.out.println("Name : " + stu.getName());
			System.out.println("Kor : " + stu.getKor());
			System.out.println("Eng : " + stu.getEng());
			System.out.println("Math : " + stu.getMath());
			System.out.println("Total : " + stu.getTotal());
			System.out.println("Avg : " + stu.getAvg());
			System.out.println("================");
						
		}
		
	}

}
