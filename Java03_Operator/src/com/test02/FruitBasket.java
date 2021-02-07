package com.test02;

public class FruitBasket {
	// class 변수   배럭에서 마린뽑았는데 공격력이 다 같은거
	static int basketSize = 30;
	// instance 변수  각 마린의 체력 1,2,3 중 1만 공격받아서 피가 혼자 닳아있는것을 말하는것
	int count = 10;
	String fruitName;

	public void basketSetting(String name, int fruit) {
		fruitName = name;
		// 1. count라는 전역변수에, 파라미터 fruit를 통해 전달된 값을 "추가"하자.
		count += fruit; // count = count + fruit;
		//int count = fruit; 내가 고민한 답... 틀림...
		
		basketPrn();

	}

	private void basketPrn() {
		System.out.println("바구니 안의 과일 : " + fruitName);

		// 2. basketSize가 count보다 크거나 같으면, fruitName + "의 갯수는 " + count + "입니다."
		// 그렇지 않으면 "바구니가 넘쳤습니다." 를 출력!!
		// 삼항연산자 사용하자.
		//String bas = (basketSize > count) ? fruitName + "의 갯수는 " + count + "입니다." : ((basketSize < count) ? "바구니가 넘쳤습니다." : fruitName + "의 갯수는 " + count + "입니다."); 
		//System.out.println(bas);  이건 맞았지만 위에서 틀려서 제대로 실행이 안됨 밑에꺼가 요약한 것.
		//String res = (basketSize >= count) ? fruitName + "의 갯수는 " + count + "입니다." : "바구니가 넘쳤습니다.";
		String res = (basketSize >= count) ? String.format("%s 의 갯수는 $d 입니다.") : "바구니가 넘쳤습니다.";
		System.out.println(res);
	}

}
