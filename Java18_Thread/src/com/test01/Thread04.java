package com.test01;

public class Thread04 {

	public static void main(String[] args) {
		MyThread03 m1 = new MyThread03("야옹");
		MyThread03 m2 = new MyThread03("멍멍");
		
		long startTime = System.currentTimeMillis();
		
		m1.start();
		
		try {
			// join() : 해당 thread가 종료될 때 까지 다른 thread를 멈춤
			m1.join();  
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		m2.start(); // 이건 조인이 없어서 밑에 메인 쓰레드랑 섞여서 나온
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("실행시간 : " + (endTime - startTime));
		
		
		
	}
}
