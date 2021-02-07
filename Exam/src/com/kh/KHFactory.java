package com.kh;

public class KHFactory {

	public static void main(String[] args) {
		System.out.println("============ KH Factory 생산 시작 =============");
		Product[] kh = new Product[5];
		
		kh[0] = new Computer(1, "KH컴퓨터", 123456);
		kh[1] = new Suger(2, "KH설탕", "흑설탕", 5);
		kh[2] = new Computer(1, "KH컴퓨터", 1256);
		kh[3] = new Suger(2,"KH설탕", "백설탕", 2);
		kh[4] = new Computer(1, "KH컴퓨터", 126);
		
		for (Product product : kh) {
			product.makeProduct();
		}
	}
}
