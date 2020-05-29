package com.leoaslan.chapter1.excer13;

import java.util.Scanner;

public class Excer13 {
    public static boolean isSquareNumber(int n) {
        for (int i = 1; i * i <= n; ++i)
            if (i * i == n)
                return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(isSquareNumber(n));
        scanner.close();
    }
}
