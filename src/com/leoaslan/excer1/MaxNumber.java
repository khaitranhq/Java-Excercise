package com.leoaslan.excer1;

import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int ans = a;
		if (ans > b)
			ans = b;
		if (ans > c)
			ans = c;

		System.out.println(ans);
		sc.close();
	}
}
