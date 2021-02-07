package com.test01;

public class MTest {

	private static String str = "The String class represents character strings.";

	public static void main(String[] args) {
		String s = "Hello"; // immutable
		// 최우선으로 계산하는것에 따라 계산이 달라짐
		System.out.println(s + 1 + 2); // 문자가 가장 먼저 계산해서 1+2가 12로 표시
		System.out.println(1 + 2 + s); // 숫자가 먼저 계산해서 1+2가 3으로 표시
		System.out.println(s);

		String h = "Hello";
		System.out.println(h); // 위에 만들어진 String Pool(메모리) 에서 가지고온다
		// 기본타입은 이미 만들어진것을 가져오는것이다.
		System.out.println(s == h); // 새로 만든게 아니라 있는거에서 가지고온거라 같다.

		String newS = new String("Hello");
		System.out.println(newS);
		// == 는 주소값이 같은건지 물어보는거 equals 는 값이 같은지 물어보는것.
		System.out.println(s == newS); // new String 으로해서 만들었기에 둘이 다르다
		System.out.println(s.equals(h)); // 값을 기준으로 같다
		System.out.println(s.equals(newS)); // 값을 기준으로 같다.

		System.out.println("------------------------");

		// 1. str의 길이
		test01();

		// 2. str 전체 대문자
		test02();

		// 3. str 전체 소문자
		test03();

		// 4. str에서 첫번째로 나오는 c의 위치 (인덱스)
		test04();

		// 5. class 단어를 찾아서 java로 바꿔서
		test05();

		// 6. character 단어를 찾아서 대문자로 변환 후, 전체 출력
		test06();

		// 7. str을 char[]로 출력하되 'c' 만 출력하자.
		// 그리고, c의 갯수를 출력
		test07();

		// 8.str을 char[]로 출력하되, 대문자만 출력하자.
		// 그리고 대문자의 갯수를 출력
		test08();

		// 9. str 사이의 공백 제거 후 출력
		test09();

		// 10. 전체를 역순으로 출력
		test10();

	}

	private static void test10() {
		int arrIndex = 0; // 문자열 처음부터 ->갈꺼고

		char[] ch = new char[str.length()];
		// 문자열 마지막부터 <-로 가는것
		for (int i = str.length() - 1; i >= 0; i--) {
			ch[i] = str.charAt(arrIndex); // 45번째부터 0까지 적히게 하는 것
			arrIndex++;
		}
		System.out.println(ch);
	}

	private static void test09() {
		System.out.println(str.trim());// str.trim() 은 문자열의 앞과 뒤의 공백을 없앤다
		System.out.println(str.replace(" ", ""));
		System.out.println(str.replaceAll(" ", "")); // 정규식을 (" ") 모두 "" 로 교체
	}

	private static void test08() {
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			// System.out.printf("%c", ch[i]);
			if (Character.isUpperCase(ch[i])) {
				System.out.printf("%c ", ch[i]);
				count++;
			}
		}
		System.out.println("\n대문자의 갯수 : " + count);

	}

	private static void test07() {
		char[] ch = str.toCharArray(); // char[] = " "
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			// System.out.printf("%c", ch[i]);
			if (ch[i] == 'c' || ch[i] == 'C') {
				System.out.printf("%c ", ch[i]);
				count++;
			}
		}
		System.out.println("\nc의 갯수 : " + count);
	}

	private static void test06() {
		// character 찾아서
		String target = "character";
		int start = str.indexOf(target);
		int end = start + target.length();
		String upper = str.substring(start, end);
		// 대문자로 변환
		upper = upper.toUpperCase(); // 이뮤터블때문에
		// 전체 출력
		System.out.println(str.replace(target, upper));

	}

	private static void test05() {
		System.out.println(str.replace("class", "java"));
	}

	private static void test04() {
		System.out.println(str.indexOf('c'));
	}

	private static void test03() {

		System.out.println(str.toLowerCase());
	}

	private static void test02() {

		System.out.println(str.toUpperCase());
	}

	private static void test01() {
		System.out.println(str.length());
	}

}
