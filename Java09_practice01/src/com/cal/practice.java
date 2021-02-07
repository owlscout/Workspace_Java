package com.cal;

import java.util.Scanner;

public class practice {
	
	public static boolean isLeapYear(int year) {
		
		boolean isLeap = false;
				if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
					isLeap = true;
				}
				
				return isLeap;
	}
	
	public static int getDates(int year, int month) {
		int result = 0;
		if (isLeapYear(year)) {
			
			switch(month) {
			case 1 : 
			case 3 : 
			case 5 : 
			case 7 : 
			case 8 : 
			case 10 : 
			case 12 : 
				result = 31;
				break;
			case 4 : 
			case 6 : 
			case 9 : 
			case 11 : 
				result = 30;
				break;
			case 2 : 
				result = 29;
			break;
			
			}
		}else {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				result = 31;
			} else if (month == 4 || month == 6 || month == 9 || month == 11) {
				result = 30;
			} else if (month == 2) {
				result = 28;
			}

		}
		return result;
	}
	
	public static String dayCharacter(int day) {
		
		switch(day) {
		case 0 : 
			return "일요일";
		case 1 :
			return "월요일";
		case 2 : 
			return "화요일";
		case 3 :
			return "수요일";
		case 4 : 
			return "목요일";
		case 5 : 
			return "금요일";
		case 6 : 
			return "토요일";
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 입력 : ");
		int year = sc.nextInt();
		
				

}
}
