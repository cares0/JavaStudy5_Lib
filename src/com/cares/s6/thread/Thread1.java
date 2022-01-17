package com.cares.s6.thread;

public class Thread1 extends Thread{

	@Override
	public void run() {

		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);// 0.5초간 잠깐 자라	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			System.out.println("i : " + i);

		}

	}

}
