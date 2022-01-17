package com.cares.s6.thread;

public class Thread2 extends Thread{

	@Override
	public void run() {
		
		for(int i='a';i<'z';i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Alpa : " + (char) i);
		}
	
	}
	
}
