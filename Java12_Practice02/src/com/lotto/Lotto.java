package com.lotto;

import java.util.Arrays;

public class Lotto {

	// 로또 "배열"
	// 1 ~ 45 사이의 '중복 없는' 랜덤한 숫자 6개
	// 정렬 되게

	public void prn() {
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;

			boolean lottocheck = false;

			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					lottocheck = true;
				}

			}
			if (lottocheck == true) {
				i--;
				break;
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
            for (int j = i + 1; j < lotto.length; j++) {
                if (lotto[i] > lotto[j]) {
                    int temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }

		
		System.out.print("이번주 로또 번호는 :");
		for (int i = 0; i < lotto.length; i++) {
			
			System.out.print(" " + lotto[i]);
		}
	}

}
