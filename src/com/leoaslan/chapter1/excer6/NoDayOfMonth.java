package com.leoaslan.chapter1.excer6;

import java.util.Scanner;

public class NoDayOfMonth {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		int year = scanner.nextInt();
		int noDays = 0;
		
		if (month == 2)
			if (year % 400 == 0 && year % 100 == 0 || year % 4 == 0)
				noDays = 29;
			else
				noDays = 28;
		else
			switch (month) {
			case 1:
				noDays = 31;
				break;
			case 3:
				noDays = 31;
				break;
			case 4:
				noDays = 30;
				break;
			case 5:
				noDays = 31;
				break;
			case 6:
				noDays = 30;
				break;
			case 7:
				noDays = 31;
				break;
			case 8:
				noDays = 31;
				break;
			case 9:
				noDays = 30;
				break;
			case 10:
				noDays = 31;
				break;
			case 11:
				noDays = 30;
				break;
			case 12:
				noDays = 31;
				break;
			}
		
		System.out.println(noDays);
		scanner.close();
	}
}
