package com.test01;

public class Type04 {
	
	// 문자형 char, 문자열 String, 논리형 boolean
	public static void main(String[] args) {
		// 문자형
		char c1 = 'a';
		System.out.println(c1);
		char c2 = 'b';
		int i1 = c2;  // char 는 영어 문자가 숫자로도 변환가능!!
		System.out.println(i1); // ascii code!!!!!
		
		char c3 = '가';
		int i2 = c3; 
		System.out.println(i2); // acii 한글 확장형
		
		// 문자열
		String s1 = "aa";
		System.out.println(s1);
		String s2 = "bb";
		System.out.println(s2);
		String sumS = s1 + s2;
		System.out.println(sumS);
		
		String s3 = "1";
		String s4 = "2";
		String sumS2 = s3 + s4;
		System.out.println(sumS2);
		
		
		//논리형
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		
	

	}

}
