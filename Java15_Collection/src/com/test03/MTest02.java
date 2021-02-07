package com.test03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.Score.Score;

public class MTest02 {

	public static void main(String[] args) {
		// Score 객체 3개 만들자.
		// 이름은 홍길동, 이순신, 김선달. 점수는 알아서.
		Score s1 = new Score();
		s1.setName("홍길동");
		s1.setKor(90);
		s1.setEng(100);
		s1.setMath(80);

		Score s2 = new Score("이순신", 57, 81, 100);

		Score s3 = new Score("김선달", 79, 100, 50);

		// Score 객체를 관리할 수 있는 Set 객체를 만들자.
		// Set type에, HashSet으로 만들자.
		Set<Score> set = new HashSet<Score>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(new Score("샤넬", 100, 100, 100));

		// printCollection(set);
		transElement(set, "홍길동" , 10);

	}
	
	public static void transElement(Set<Score> set, String target, int kor) {
		// set에서 "홍길동"을 찾아서, 국어점수를 10점으로 바꾸고, 전체 출력
		// 찾을때 iterator를 사용하자!!!
		Iterator<Score> itr = set.iterator();
		while(itr.hasNext()) {
			/*
			if(itr.next().getName() == target) {  // 넥스트로 다음껄 불렀는데
				itr.next().setKor(kor);   		// 여기서 넥스트가 1번더있어서 2칸밑의꺼 를 부르기에 오류나게됨
			}
			*/
			Score temp = itr.next();
			if(temp.getName().equals(target)) { // 문자열 비교할때는 equals 
				temp.setKor(kor);
			}
		}
		// 출력
		Iterator<Score>ir = set.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
		
	}

	public static void printCollection(Set<Score> set) {
		// 1. 향상된 for each문
		for (Score sc : set) {
			System.out.println(sc);
		}

		System.out.println("---------------");

		// 2. .toArray
		Object[] oArr = set.toArray();
		for (int i = 0; i < oArr.length; i++) {
			// System.out.println(oArr[i]);
			// System.out.println(oArr[i].getName()); // Object type 이라서
			// 자식타입으로 형변환 (Score)oArr[i]
			System.out.println(((Score) oArr[i]).getName() + "\t" + String.format("%.2f", ((Score) oArr[i]).getAvg()));
			// System.out.printf("%s \t %.2f\n",
			// ((Score)oArr[i]).getName(),((Score)oArr[i]).getAvg());
		}
		System.out.println("--------------------------");
		// 3. Iterator : 컬렉션 저장 요소를 읽어오는 표준화된 방법 // 리스트로 만들어진것도 가져와서 할 수 있다.
		// set 에 스코어가 있는걸 Iterator<Score> 에 1개씩 가져오는데 (日 이런 박스에 칸칸이)
		// 맨위에 커서가 있다면 첫칸에 넣으면 (next)가 다음꺼가 있다면(has~) 밑에칸으로 커서가 옮겨져서 넣게끔함
		Iterator<Score> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		} // hasNext 가 false될때까지 반복

	}
}
