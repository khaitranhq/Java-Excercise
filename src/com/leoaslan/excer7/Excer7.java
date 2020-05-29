package com.leoaslan.excer7;

import java.util.Scanner;

public class Excer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double ans = 0;
        for (int i = 1; i <= n; ++i)
            ans += (double) 1 / i;

        System.out.println(ans);
        scanner.close();
    }
}
