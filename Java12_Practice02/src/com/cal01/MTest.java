package com.cal01;

import java.util.Scanner;

public class MTest {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("연도 : ");
		 int year = sc.nextInt();
		 System.out.println("월 : ");
		 int month = sc.nextInt();
		 DayofCalendar.prn(year, month);
		 
	}
	
}
