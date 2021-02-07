package com.test01;

import java.io.File;
import java.io.IOException;

public class MTest01 {

	public static void main(String[] args) {
		// mac : /Users / 계정 / test_io
		File fi = new File("C:/test_io"); // 경로 적을때 \가 기본이지만 /로 적어도 된다

		if (fi.exists()) {
			System.out.println("exists");
		} else
			System.out.println("make directory");
		fi.mkdirs(); // make directory의 줄임말

		// fi 안에 (밑에) AA 라는 folder(directory) 생성
		File fiAA = new File(fi, "AA");
		fiAA.mkdir();

		File fiBB = new File("C:\\test_io", "BB"); // \\ 2개 한 이유는 \t 같은 역활을 수행하는걸 방지하려고
		fiBB.mkdir();

		// AA 밑에 a.txt 파일 생성
		File aTxt = new File(fiAA, "a.txt");
		// aTxt.createNewFile(); 이렇게 하면 오류나서 빨간줄에 마우스 올려서 해결법 사용한 것
		try {
			// checked exception
			aTxt.createNewFile(); // IOexception 발생할 수 있는데 이건 checked exception 라서 체크해야한다.
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
