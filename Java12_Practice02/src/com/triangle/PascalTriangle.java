package com.triangle;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 			1
 * 		  1   1
 *		1   2   1
 *	   1  3   3   1
 *   1  4   6   4  1
 *  1  5  10  10  5  1
 *  ...
 * 
 */

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("level : ");
		int n = sc.nextInt();

		int[][] arr = new int[n][];

		arr[0] = new int[] {1};   //  첫번째 줄은 1이라는 식
		for (int i = 1; i < arr.length; i++) { // 위에꺼 다 지우고 int i = 0; i < arr.length; i++
												//로 해도 되지만 시작이 첫번쨋줄 1을 표시해야하는데 알기쉽게해주려고 이렇게함
			arr[i] = new int[i + 1];   // 이게 줄바꿀때마다 숫자 1개씩 늘어나게 하는 식

			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 || j == arr[i].length - 1) {  //양 끝에 1을 넣고
					arr[i][j] = 1;
				} else { // 아닐경우 위의 양쪽 수를 더해서 출력
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];

				}
			}

		}
		//System.out.println(Arrays.deepToString(arr));
		prn(arr);

	}

	private static void prn(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length; j > i; j--) {
				System.out.print("  "); // 이거로 피라미드처럼 나오게 하는 식
			}
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
	}

}
