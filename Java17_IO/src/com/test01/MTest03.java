package com.test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MTest03 {

	public static void main(String[] args) {
		
		File fi = new File("a.txt");
		// 자바에서 밖에 파일(메모장)에 빼는거라 아웃풋
		// code -> file 아웃풋	(code가 '나')
		// 파일에 있는것을 자바로 가져오는건 인풋
		// file -> code  인풋		(code가 '나')
		try {
			MyOutput(fi);
			MyInput(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	private static void MyInput(File fi) throws IOException {
		FileInputStream fin = new FileInputStream(fi); //data(byte)(자기 기준) 가 흘러들어온다
		int res = 0;
		
		// file의 내용 끝 = -1
		while ((res = fin.read()) != -1) {  
			System.out.print((char)res);
		}
		
		fin.close();
		
	}
	
	
	// throws : 해당 메소드 내부에서 발생할 수 있는 예외를 메소드 호출하는 곳으로 위임
	private static void MyOutput(File fi) throws IOException {
		FileOutputStream fo = new FileOutputStream(fi);  // data(byte)(자기 기준) 가 흘러나간다
		// FileNotFoundException 가 fo.write throws 하면 IOException가 생기는데 이게 더 상위꺼라 이걸에 포함된다.
		
		for(int i = 65; i < 91; i++) { // ascii코드
			fo.write(i);
		}
		
		// 반드시!!!
		fo.close();
		
	}
	
}
