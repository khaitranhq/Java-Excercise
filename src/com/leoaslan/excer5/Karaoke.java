package com.leoaslan.excer5;

import java.util.Scanner;

public class Karaoke {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt(),
			b = scanner.nextInt();
	
		if (b < 18)
			System.out.println(45000 * (b - a));
		else
			System.out.println(60000 * (b - a));
	
		scanner.close();
	}
}
