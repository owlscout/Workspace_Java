package com.test01;

class MyThread01 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) { // 0 ~ 9까지 출력
			System.out.println("i : " + i);
		}
		
	}
	
	
}

public class Thread01 {
	// main thread 이다. -> 우선순위가 높다.
	public static void main(String[] args) {
		
		System.out.println("main start ---------------");
		
		// Thread가 아니다
		/*
		MyThread01 my01 = new MyThread01();
		MyThread01 my02 = new MyThread01();
		
		my01.run();
		my02.run();
		*/
		
		// Thread 이다.    implements Runnable  를 사용할땐 이렇게 해야 된다.
		Thread my01 = new Thread(new MyThread01()); // 병렬 이어서 동시에 돌음
		Thread my02 = new Thread(new MyThread01());
		
		my01.start(); // start()는 run()을 자동으로 호출함
		my02.start();
		
		
		
		System.out.println("main stop -------------------");
	}
}
