package com.cares.s3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberData {

	private String data;
	private Scanner sc;


	public MemberData() {
		this.sc = new Scanner(System.in);
		this.data = "ID1 - PW1 - Name1 - ID1@gmail.com - 10 - ";
		this.data = this.data + "ID2 - PW2 - Name2 - Name2@naver.com - 20 - ";
		this.data = this.data + "ID3 - PW3 - Name3 - Name3@daum.net - 30";
		System.out.println(this.data);
	}

	public void addMember(ArrayList<MemberDTO> ar) {
		// 새로 추가할 MemberDTO 생성
		// 키보드로부터 Id, Pw, Name, Email, Age 를 입력받아서
		// MemberDTO의 멤버변수 값으로 대입
		// 매개변수로 받은 ar에 MemberDTO 추가

		System.out.println("몇 명의 정보를 추가하시겠습니까?");
		int count = sc.nextInt();
		for (int i=0;i<count;i++) {
			MemberDTO memberDTO = new MemberDTO();
			System.out.println(i+1 + "번째 Id 정보 입력");
			memberDTO.setId(sc.next());
			System.out.println(i+1 + "번째 Pw 정보 입력");
			memberDTO.setPw(sc.next());
			System.out.println(i+1 + "번째 Name 정보 입력");
			memberDTO.setName(sc.next());
			System.out.println(i+1 + "번째 Email 정보 입력");
			memberDTO.setEmail(sc.next());
			System.out.println(i+1 + "번째 Age 정보 입력");
			memberDTO.setAge(sc.nextInt());

			ar.add(memberDTO);
		}

	}

	public MemberDTO removeMemberAnswer(ArrayList<MemberDTO> ar) {
		MemberDTO memberDTO = null;

		System.out.println("삭제할 ID 입력");
		String id = this.sc.next();

		for(int i=0;i<ar.size();i++) {
			if (ar.get(i).getId().equals(id)) {
				memberDTO = ar.remove(i);				
			}

		}

		return memberDTO;
	} // 리턴으로 memberDTO를 주기 때문에 결과에 따라서 삭제 실패면 어떤일을 하고
	// 성공이면 어떤 일을 하고를 외부에서 처리가 가능하다.



	public void removeMember(ArrayList<MemberDTO> ar) {
		// 삭제하고 싶은 ID를 입력받음
		// ArrayList에서 해당ID와 똑같은 DTO를 삭제
		boolean check = true;

		while(check) {
			System.out.println("삭제하고자 하는 ID를 입력해주세요");
			String delete = sc.next();

			for(int i=0;i<ar.size();i++) {
				if (delete.equals(ar.get(i).getId())) {
					ar.remove(i);
					check = false;
					break;
				} 
			}

			if (check == true) {
				System.out.println("없는 ID입니다. 다시 입력하시겠습니까?");
				System.out.println("1. 예");
				System.out.println("2. 아니오");
				int num = sc.nextInt();
				if (num == 2) {
					check = false;
					System.out.println("삭제를 취소하셨습니다.");
					break;
				}			
			}
		} // 리턴없이 해버리면 삭제를 했는지 안했는지는 밖에서 모르니까 
		// 삭제를 성공했으면 이걸 하고, 실패했으면 이걸하고 이런걸 못하게 됨

	}

	public ArrayList<MemberDTO> init() {
		// data에 있는 문자열을 StringTokenizer로 파싱해서
		// MemberDTO를 생성해서 멤버변수값으로 대입
		// 만들어진 MemberDTO를 ArrayList에 담아서 리턴

		StringTokenizer st = new StringTokenizer(data, "-");
		ArrayList<MemberDTO> ar = new ArrayList<>();

		while (st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			memberDTO.setId(st.nextToken().trim());
			memberDTO.setPw(st.nextToken().trim());
			memberDTO.setName(st.nextToken().trim());
			memberDTO.setEmail(st.nextToken().trim());
			memberDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			ar.add(memberDTO);
		}
		return ar;
	}

}

