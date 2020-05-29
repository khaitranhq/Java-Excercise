package com.leoaslan.excer11;

import java.util.Scanner;

public class Excer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n <= 0) {
            scanner.close();
            return;
        }

        int sum = 0, mul = 1;
        while (n > 0) {
            sum += n % 10;
            mul *= n % 10;
            n /= 10;
        }

        System.out.println(sum);
        System.out.println(mul);
        scanner.close();
    }

}
