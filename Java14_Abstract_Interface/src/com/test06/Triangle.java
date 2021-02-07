package com.test06;

import java.util.Scanner;

public class Triangle extends AreaImpl {
	
	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑변을 입력해 주세요 : ");
		int x = sc.nextInt();
		System.out.println("높이를 입력해 주세요 : ");
		int y = sc.nextInt();
		
		double res = (double)(x * y) / 2;
		
		//setResult(String.valueOf(res));
		//setResult(Double.toString(res));
		//setResult(res + "");
		setResult(String.format("%.2f", res));
	}

	public void print() {
		System.out.println("삼각형의 ");
		super.print();
	}
}
