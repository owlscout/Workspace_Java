package com.kh;

public class Computer extends Product {
	
	private int serialNumber;
	
	public Computer() {
		// super(); 생략되어잇음
	}
	
	public Computer(int productCode, String productName, int serialNumber) {
		super(productCode, productName);
		this.serialNumber = serialNumber;
	}
	
	

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public void makeProduct() {
		System.out.println(super.toString() + ", 제품 번호 : " + serialNumber + "컴퓨터를 생산하였습니다.");
		
		
	}

}
