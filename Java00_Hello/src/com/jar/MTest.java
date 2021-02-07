package com.jar;

import com.my.Score;

public class MTest {

	public static void main(String[] args) {
		Score sc = new Score("홍길동", 100, 100, 100);
		System.out.println(sc);
		
		Score lee = new Score();
		lee.setName("이순신");
		lee.setKor(100);
		lee.setEng(90);
		lee.setMath(83);
		System.out.println(lee);
		
		
	}
}
