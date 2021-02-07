package com.test02;

public class ContunueTest {

	public static void main(String[] args) {
		
		prn();

	}
	public static void prn() {
		int i = 0;
		
		while(i < 10) {
			i++;
			if (i % 2 == 0) {
				continue;  // 이거만나면 밑을 확인하지 않고 바로 와일로 다시 돌아가서 조건 확인 실행하기
			}
			System.out.println(i);
		}
	}

}
