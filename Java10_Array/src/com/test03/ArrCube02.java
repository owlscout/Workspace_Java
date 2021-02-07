package com.test03;

public class ArrCube02 {
	/*
	 * 1 2 3 4 5 
	 * 10 9 8 7 6 
	 * 11 12 13 14 15 
	 * 20 19 18 17 16 
	 * 21 22 23 24 25
	 * 
	 * 모양의 이차원 배열을 만들어서 출력하자.
	 */

	/*
	 * int tmp = 1; for (int i = ch.length; i > 0; i--) { System.out.printf("%s ",
	 * ch[i-1]); if (tmp % 6 == 0) { System.out.println(); }
	 * 
	 * tmp++; }
	 */
	public static void main(String[] args) {
		int inputNum = 5;
		int[][] a = new int[inputNum][inputNum];
		int num = 1;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i % 2 == 1) {
				a[i][inputNum- 1 -j] = num;
				}else {
					a[i][j]= num;
				}
				num++;
			}
		
			
		}for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + "\t");
			}System.out.println();
		}

	}

}
