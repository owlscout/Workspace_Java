package com.test04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.Score.Score;

public class MTest02 {

	public static void main(String[] args) {
		Score sc01 = new Score("김선호", 100, 89, 57);
		Score sc02 = new Score("강슬기", 89, 100, 65);
		Score sc03 = new Score("수지", 66, 49, 100);

		Map<Integer, Score> map = new HashMap<Integer, Score>();
		map.put(1, sc01);
		map.put(3, sc03);
		map.put(2, sc02);

		// System.out.println(map);

		prn(map);
	}

	public static void prn(Map<Integer, Score> map) {
		// 이름이 "김선호" 인 value를 찾아, 다음과 같이 출력하자.
		// 출력 결과) 1: 김선호 (82)

		Set<Entry<Integer, Score>> entrySet = map.entrySet();
		/*
		 * for (Entry<Integer, Score> entry : entrySet) {
		 * if(entry.getValue().getName().equals("김선호")) {
		 * System.out.println(entry.getKey()+ " : " + entry.getValue().getName() + " ("
		 * + entry.getValue().getAvg() + ") "); } } Iterator<Score> iterator =
		 * set.iterator(); while (iterator.hasNext()) {
		 * System.out.println(iterator.next());
		 */
		Iterator<Entry<Integer, Score>> interator = entrySet.iterator();

		while (interator.hasNext()) {
			Entry<Integer, Score> temp = interator.next(); // 김선호 를 찾아내기위한 이름을 꺼내오는 식

			if (temp.getValue().getName().equals("김선호")) {
				System.out.println(
						temp.getKey() + " : " + temp.getValue().getName() + " (" + temp.getValue().getAvg() + ") ");

			}

		}

	}
}
