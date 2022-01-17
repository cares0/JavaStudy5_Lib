package com.cares.s5.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) {
		System.out.println("Server 입니다");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			System.out.println("클라이언트 접속을 기다리는 중");
			serverSocket = new ServerSocket(8282); // 접속준비
			socket = serverSocket.accept(); 
			System.out.println("접속한 Client와 1:1 연결 완료");
			
			InputStream is = socket.getInputStream(); // 0, 1 처리
			InputStreamReader ir = new InputStreamReader(is); // char타입 처리
			BufferedReader br = new BufferedReader(ir); // String 처리
			// 읽을 준비 처리
			
			String message = br.readLine();
			
			System.out.println("Client : " + message);
			
			// server에서 클라이언트로 메세지 전송
			System.out.println("클라이언트로 보낼 메시지 입력");
			Scanner sc = new Scanner(System.in);
			message = sc.next();
			System.out.println(message); 
			// 0, 1의 데이터로 보내야 함 > 한글자씩 다 자름(char타입으로) > char타입은 0, 1로 바꿀 수 있음
			// 서버에선 0, 1을 모아서 문자열로 바꿈 
			
			// 1. output Stream을 구해오기
			OutputStream os = socket.getOutputStream();
			// byte(bit처리) > 0, 1로 바꾸기 전에 문자로 처리하는 과정이 필요
			OutputStreamWriter ow = new OutputStreamWriter(os);
			// char 로 바꾸는 작업
			BufferedWriter bw = new BufferedWriter(ow);
			// 전송 준비 끝
			
			// 전송
			bw.write(message+"\r\n");
			// 강제로 버퍼 비우기
			bw.flush();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
