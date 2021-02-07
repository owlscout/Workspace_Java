package com.test03;

public class PrnTest {
	
	/*
	 * System.out.print() - 줄 바꿈 없음
	 * System.out.println() - 줄 바꿈 없음 
	 * 
	 * System.out.printf(String format, Object, Object, ... args) - 
	 * java.util.Formatter
	 */

	public static void main(String[] args) {
		
		int i = 100;
		
		System.out.print("1. i : \\" + i + "\n");  // \문자 = escape sequence
		System.out.println("2. i : \t " + i);
		System.out.printf("3. i : %10d", i); // 정수 %d 실수 %f 문자 1개는 %c,문자열 %s 
		System.out.println("-------------");
		
		// 시험 점수 결과는 100(su)점 이고, 학점은 'A(ch)' 가 나왔다.
		// 나의 오느ㅡㄹ 감정지수는 90.50(d)% 이다.
		
		int su = 100;    // 10자리
		char ch = 'A';   // 5자리
		double d = 90.50d; // 5자리 (소수점 2자리)
		// System.out.printf() 를 쓰자
		
		System.out.printf(" 시험 점수 결과는 %10d점 이고, 학점은 '%c'가 나왔다.\n 나의 오늘 감정 지수는 %5.2f%% 이다.\n", su ,ch ,d);
		
		// 오늘은 11\24 입니다. 제 나이는 00(age)입니다. 제 이름은 00(name)입니다.
		int age = 30;
		String name = "김호수";
		
		System.out.printf(" 오늘은 11\\24 입니다. 제 나이는 %d살 입니다. 제 이름은 %s 입니다.", age, name);
		
		
		
	}

}
