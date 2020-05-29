package com.leoaslan.chapter1.excer2;

import java.util.Scanner;

public class FirstDegreeEquation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		if (a == 0)	
			if (b != 0)
				System.out.println("Phuong trinh vo nghiem");
			else
				System.out.println("Phuong trinh vo so nghiem");
		else
			System.out.println("Nghiem cua phuong trinh = " + -b /a);
		scanner.close();
	}
}
