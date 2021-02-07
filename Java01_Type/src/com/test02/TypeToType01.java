package com.test02;

public class TypeToType01 { // TypeTOType 카멜 표기법  Type_to_type 스네이크 표기법
		
	public static void main(String[] args) {
		
		//1. int to char
		int i = 65;
		char c = (char)i;
		System.out.println(c);
		
		// 2. char to int;
		char c2 = 'B';
		int i2 = (int)c2;
		System.out.println(i2);
		
		char c3 = '1'; // ascii code 1은 49
		char c4 = '9'; // ascii code 9는 57
		int i3 = c3 + c4;
		System.out.println(i3);
		
		// 3. String to int
		
		String str = "33";
		System.out.println(str + 1);
		int i4 = Integer.parseInt(str);
		System.out.println(i4 + 1);
		
		// 4. int to String
		int i5 = 55;
		System.out.println(i5 + 1);
		String s5 = Integer.toString(i5);
		System.out.println(s5 + 1);
		String s6 = String.valueOf(i5);
		System.out.println(s6 + 1);
		
	}

}
