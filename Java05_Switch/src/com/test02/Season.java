package com.test02;

public class Season {

	
	public static String prn(int month) {
		String res = null;
		
		switch(month) {
		case 12: 
		case 1:  
		case 2:
			res = "겨울";
			break;
		case 3: 
		case 4: 
		case 5:
			res= "봄";
			break;
		case 6: 
		case 7: 
		case 8:
			res = "여름";
			break;
		case 9: 
		case 10: 
		case 11:
			res = "가을";
			break;
		default:
			res = "1~12 사이의 값만 입력해 주새요.";
		
			
		}
	return res;

	}

}
