package com.leoaslan.excer9;

import java.util.Scanner;

public class Excer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        double ans = 1, factor = 1;
        for (int i = 2; i <= n; ++i) {
            int j = 2 * i - 1;
            factor *= j * (j - 1);
            ans += 1 / factor;
        }

        System.out.println(ans);
        scanner.close();
    }
}
