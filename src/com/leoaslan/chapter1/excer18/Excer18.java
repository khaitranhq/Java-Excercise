package com.leoaslan.chapter1.excer18;

import java.util.Scanner;

public class Excer18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int a = 1, b = 1, cnt = 2;
        while (b < n) {
            ++cnt;
            int c = a + b;
            a = b;
            b = c;
        }
        if (b == n) {
            System.out.println("YES");
            System.out.println(cnt);
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
