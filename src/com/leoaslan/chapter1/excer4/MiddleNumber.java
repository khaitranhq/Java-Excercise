package com.leoaslan.chapter1.excer4;

import java.util.Scanner;

interface LambdaFunction {
	public int call(int a, int b, int c);
}

public class MiddleNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		//Practice lambda function, require JAVA 8
		LambdaFunction getMiddleNumber = (x, y, z) -> {
			if (y > x && x > z || y < x && x < z)
				return x;
			
			if (x > y && y > z || x < y && y < z)
				return y;
			
			return z;
		};
		
		System.out.println("So trung gian la:" + getMiddleNumber.call(a, b, c));
		
		scanner.close();
	}
}
