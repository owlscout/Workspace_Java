package com.test02;

public class TypeToType03 {

	public static void main(String[] args) { // wrapper class
		
		// boxing 기본 타입 - > 참조 타입
		Integer i = new Integer(100);
		System.out.println(i);
		System.out.println(i.doubleValue());
		
		// unBoxing 참조 타입  -> 기본 타입  참조 타입의 값(riteral)을 가져오는 것
		// 명시적
		int j = i.intValue();
		System.out.println(j);
		
		//묵시적
		int k = i;
		System.out.println(k);
		
		

	}

}
