package com.leoaslan.chapter1.excer8;

import java.util.Scanner;

public class Excer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double ans = 15, sign = 1, factor = 1;
        for (int i = 1; i <= n; ++i) {
            sign *= -1;
            factor *= i;
            ans += sign / factor;
        }

        System.out.println(ans);
        scanner.close();
    }
}
