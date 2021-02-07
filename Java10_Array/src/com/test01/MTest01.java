package com.test01;

import java.util.Arrays;

public class MTest01 {

	public static void main(String[] args) {

		// 방법 1.
		// 타입 변수
		int[] a; // int a[]; - 둘다 상관없지만 주로 자바는 앞 c언어는 뒤 // 선언
		a = new int[5];// 값 // 정의
		a[0] = 1; // 초기화
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		// 방법 2.
		int[] b = new int[] { 5, 4, 3, 2, 1 }; // 선언 정의 초기화

		// 방법 3.
		int[] c = { 6, 7, 8, 9, 10 }; // 선언 초기화

		System.out.println(a[0]);

		System.out.println(a[0] + b[1] + c[2]);

		System.out.println(c); // 배열의 투스트링을 출력
		System.out.println(Arrays.toString(c)); // 배열된 것을 출력

		String[] s = new String[] { "Have", "a", "nice", "day" };
		prn(s);
		modi(s);
		
	}
	
	public static void modi(String[] arr) {
		//nice -> good 변경 후 전체 출력
		//[Have, a, good, day] (Arrays.toString 사용 금지!)
		arr[2] = "good";
		
		System.out.print("\n[");
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.printf("%s", arr[i]);
			}else {
				System.out.printf("%s, ", arr[i]);
			}
			
		}
		System.out.print("]");
		
	}

	public static void prn(String[] arr) {
		//{Have a nice day }
		// hint! 배열은 0부터 length -1 까지
		System.out.print("{");
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%s ", arr[i]);
		}
		System.out.print("}");
		
		
	}

}
