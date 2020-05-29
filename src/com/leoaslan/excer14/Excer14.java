package com.leoaslan.excer14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excer14 {
    public static boolean isPalindromeNumber(int n) {
        List<Integer> digits = new ArrayList<Integer>();

        do {
            digits.add(n % 10);
            n /= 10;
        } while (n > 0);

        int left = 0, right = digits.size() - 1;
        while (left <= right) {
            if (digits.get(left) != digits.get(right))
                return false;
            ++left;
            --right;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println(isPalindromeNumber(n));
        scanner.close();
    }

}
