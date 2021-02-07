package com.test01;

public class MTest {

	public static void main(String[] args) {

		prn01();
		prn02();

	}
	public static void prn02() {
		int i = 5;
		
		switch (i) { // (i%2) 하고 케이스 1만남기고 case2~ 10 지우고 default 적으면 됨
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("홀수입니다.");
			break;
		case 2: 
		case 4: 
		case 6: 
		case 8: 
		case 10:
			System.out.println("짝수입니다.");
			break;
		
		}
		
		
		
	}

	public static void prn01() {
		int i = 4;

		// if는 가장 위의 조건부터 순차적으로 모든 콛를 읽지만
		// switch는 해당 식/값에 맞는 case로 jumping 한다. => 컴파일러가 작업하기 수월하다.
		// fall through

		switch (i) { // 브레이크를 만나면 {}밖으로 나가라 
		case 1:
			System.out.println("1 입니다.");
			break;
		case 2:
			System.out.println("2 입니다.");
			break;
		case 3:
			System.out.println("3 입니다.");
			break;
		default: // if 문의 else 같은 역할
			System.out.println("1, 2, 3 아닙니다.");
		}

	}

}
