package com.leoaslan.chapter1.excer16;

import java.util.Scanner;

public class Excer16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 1000; ++i) {
            int sum = 1;
            for (int j = 2; j * j <= i; ++j) {
                if (i % j != 0) continue;
                sum += j;
                if (i / j != j) sum += i / j;
            }
            if (sum == i)
                System.out.println(i);
        }
        scanner.close();
    }
}
