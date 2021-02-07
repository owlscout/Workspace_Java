package com.test03;

public class Mtest {

	public static void main(String[] args) {

		int mySum = MyCalc.sum(10, 2); // argument
		System.out.println(mySum);

		MyCalc.sub(10, 3);

		// 곱하기
		// mul 메소드 호출하는데
		// 아규먼트는 10, 3
		// 호출해서 리턴된 결과 값을
		// console에 출력하자.
		double myMul = MyCalc.mul(10, 3); // 묵시적 형 변환
		System.out.println(myMul);

		// MyCalc.div(10, 3);
		MyCalc calc = new MyCalc();
		calc.div(10, 3);

	}

}
