package com.leoaslan.excer3;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double delta = b * b - 4 * a * c;
		
		if (delta < 0) 
			System.out.println("Phuong trinh vo nghiem");
		else
			if (delta == 0)
				System.out.println("Phuong trinh co nghiem kep: " + -b / (2 * a));
			else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				
				System.out.println("Nghiem 1: " + x1);
				System.out.println("Nghiem 2: " + x2);
			}
		
		scanner.close();
	}
}
