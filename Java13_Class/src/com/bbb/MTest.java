package com.bbb;

import com.aaa.AAA;

public class MTest {
	
	public static void main(String[] args) {
		// type 변수 = 값;
		// type 변수 = new 생성자();
		AAA myA = new AAA();
		myA.prn();
		AAA paramA = new AAA(10);
		paramA.prn();
		System.out.println("abc : " + paramA.getAbc());
		paramA.setAbc(100);
		System.out.println("abc : " + paramA.getAbc());
		System.out.println("=============================");
		BBB b1 = new BBB(); // 부모객체 만들어진 후 자식객체 만들어짐, b1은 동시에 부모의 주소값을 가짐
		b1.setAbc(10);
		b1.setBcd(20);
		System.out.println(b1.getSum());
		
		BBB b2 = new BBB(15);
		System.out.println(b2.getSum());
		
		BBB b3 = new BBB(20, 50);
		System.out.println(b3.getSum());
		
		// 부모의 메서드를 통해 자식 메서드가 호출된다.
		AAA a1 = new AAA();
		AAA a2 = new BBB();
//		BBB a3 = new AAA();
		a1.prn();
		a2.prn();
		a2.getAbc();
//		a2.getBcd();
		((BBB)a2).getBcd();
		
	}

}
