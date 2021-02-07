package com.test01;

public class WhileTest {

	public static void main(String[] args) {
		/*
		 * 1. 1 ~ 100 까지의 숫자를 역순으로 출력하자.
		 * 
		 * 2. 1 ~ 100 까지의 숫자 중, 2의 배수만 출력하자.
		 * 
		 * 3. 1 ~ 100 까지의 숫자 중 7의 배수의 갯수와, 7의 배수의총 합을 출력하자.
		 */
		test01();
		test02();
		test03();

	}


	public static void test01() {
		int i = 100;

		do {
			System.out.println(i);
			i--;
		} while (i > 0);

	}

	public static void test02() {
		int i = 1;

		while (i <= 100) {
			//만일 i가 2의 배수라면 i를 출력하자.

			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

	public static void test03() {
		int i = 1;
		int count = 0;
		int sum = 0;
		
		while (i <= 100) {
			
			if(i % 7 == 0) {
				System.out.printf("%d ", i);
				//7의 배수의 개수
				count++;
				//7의 배수의 총 합
				sum += i; //sum = sum + i;
			}
			i++;
		
			
		}
		System.out.printf("\n7의 배수의 개수는 : %d개\n7의 배수의 총 합은 : %d", count, sum);
	}

}
