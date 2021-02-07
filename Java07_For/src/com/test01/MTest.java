package com.test01;

public class MTest {

	public static void main(String[] args) {
		
		//prn01();
		//prn02();
		prn03();
	

	}
	public static void prn01() {
		// 실행 순서 1번     2번       4번     2,3,4반복
		// for ( 초기 값 ; 조건식  ;  증감식) {   }
		for (int i = 0; i < 10; i++) {
			System.out.println(i); // 3번
		}
	}
	public static void prn02() {
		for(int i = 100; i > 0; i--) {
			System.out.println(i);
		}
	}
	public static void prn03() {
		
		for (int i = 0; i < 10; i++) {
			
			for(int j = 0; j < 10; j++) {
				
				System.out.printf("%d, %d\n", i, j);
				
			}
		System.out.println();
		}
		
		
	}
	

}
