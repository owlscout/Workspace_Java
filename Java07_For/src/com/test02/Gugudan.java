package com.test02;

public class Gugudan {

	public static void main(String[] args) {
		// for 문을 사용하여 출력 !!!!
		// while문 사용 지!

		// 1. 2단 부터 9단까지 전체 출력
		//gugu01();
		guguWhile01();
		// 2. 아규먼트로 들어온 값의 단만 출력
		//gugu02(1);
		guguWhile02(9);
	}
	public static void guguWhile01() {
		/*int i = 1;

		while (i <= 100) {
			//만일 i가 2의 배수라면 i를 출력하자.

			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}*/
		int i = 2;
		
			while (i < 10) {
			System.out.println("\n<" + i + "단>");
				int j = 1;
				while (j < 10) {
					System.out.printf("%d * %d = %d \n", i, j, (i * j));
				j++;
				}
			i++;	
			}
		
	}
	
	public static void guguWhile02(int i) {
		System.out.println("\n<" + i + "단>");
		int j = 1;
		while(j < 10) {
			System.out.println(i + " * " + j + " = " + i * j);
		j++;
		}
	}
	

	public static void gugu01() {
		for (int i = 2; i < 10; i++) {
			System.out.println("\n<" + i + "단>");
			
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d \n", i, j, (i * j));
				//System.out.println(i + " * " + j + " = " + i * j);
			}
		}

	}

	public static void gugu02(int i) {

		System.out.println("\n<" + i + "단>");
		for (int j = 1; j < 10; j++) {
			System.out.println(i + " * " + j + " = " + i * j);
		}
	}
}
