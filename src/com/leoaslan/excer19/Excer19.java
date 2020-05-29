package com.leoaslan.excer19;

import java.util.Scanner;

public class Excer19 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(),
                b = scanner.nextInt();

        System.out.println(gcd(a, b));
        System.out.println(a * b / gcd(a, b));
        scanner.close();
    }
}
