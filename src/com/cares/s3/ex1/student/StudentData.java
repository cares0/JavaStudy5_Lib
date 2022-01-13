package com.cares.s3.ex1.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cares.s3.ex1.member.MemberDTO;

public class StudentData {

	
	public Map<String, StudentDTO> addStudent(List<MemberDTO> ar) {
		// ar 안에 memberDTO를 학생의 정보로 취급
		// member의 수만큼 성적 정보를 입력하면 됨
		// 이 정보들을 StudentDTO에 넣어주는 것임
		// MemberDTO의 갯수만큼 StudentDTO의 갯수가 나올 것임
		// 국어 영어 수학 입력받고 총점 평균을 자동 계산
		// Id와 Name은 MemberDTO에서 가져와
		// Map의 Key는 Id로 설정
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, StudentDTO> map = new HashMap<>();
			
		for(int i=0;i<ar.size();i++) {
			StudentDTO stu = new StudentDTO();
			System.out.println("ID가 " + ar.get(i).getId() + "인 학생의 점수를 입력합니다.");
			
			System.out.println("국어점수를 입력하세요.");
			stu.setKor(sc.nextInt());
			System.out.println("영어점수를 입력하세요.");
			stu.setEng(sc.nextInt());
			System.out.println("수학점수를 입력하세요.");
			stu.setMath(sc.nextInt());
			stu.setTotal(stu.getTotal());
			stu.setAvg(stu.getAvg());			
			stu.setId(ar.get(i).getId());
			stu.setName(ar.get(i).getName());			
			map.put(stu.getId(), stu);
			
		}				
		return map;
	}
}
