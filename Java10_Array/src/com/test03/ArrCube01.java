package com.test03;

public class ArrCube01 {
	/*
	 * 1 4 7
	 * 2 5 8
	 * 3 6 9
	 * 
	 * 	모양의 이차원 배열을 만들어서 출력하자
	 */
	
	public static void main(String[] args) {
		int[][]a = new int[3][3];
		
		for (int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++) { // a[i].length 로 안적으면 3 3 이어서 지워도 되는거지 
													//  없으면 아마 3 2 든 둘이 다르면 오류가 무조건 난다!
				a[i][j]=(i+1)+j*3;
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}
	
	}
}
