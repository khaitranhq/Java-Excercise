package com.leoaslan.chapter1.excer17;

import java.util.Scanner;

public class Excer17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n >= 1)
            System.out.print(1 + " ");
        if (n >= 2)
            System.out.print(2 + " ");
        if (n > 2) {
            int a = 1, b = 1;
            for (int i = 3; i <= n; ++i) {
                int c = a + b;
                a = b;
                b = c;
                System.out.print(b + " ");
            }
        }
        scanner.close();
    }
}
