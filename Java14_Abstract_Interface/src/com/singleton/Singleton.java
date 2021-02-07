package com.singleton;

// singleton pattern : 메모리(heap)에 객체를 한번만 생성
public class Singleton {

	// 2. 객체를 확인할 주소(reference) 변수 선언
	private static Singleton singleton;
	
	
	// 1. 생성자를 외부에서 사용할 수 없도록 private으로 선언
	private Singleton() {
		System.out.println("singleton instance 생성");
	}
	
	// 3. 객체가 heap에 있는지 확인
	// 있으면 주소값 리턴, 없으면 새로운 객체 생성
	public static Singleton getInstance() { // static 으로 만들어져서 스태틱의 변수를 확인
		if(singleton == null) { // 				변수가 없으면
			singleton = new Singleton();
			System.out.println("new!");
		} else { //  							변수가 있으면
			System.out.println("exist!");
		}
		
		return singleton;
	}
	
	
	
}
