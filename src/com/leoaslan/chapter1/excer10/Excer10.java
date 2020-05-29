package com.leoaslan.chapter1.excer10;

import java.util.Scanner;

public class Excer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int ans = 1;
        for (int i = 1; i <= n; ++i)
            if ((n % 2 == 0) ^ (i % 2 == 0) == false)
                ans *= i;

        System.out.println(ans);
        scanner.close();
    }
}
