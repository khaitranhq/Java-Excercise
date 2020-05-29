package com.leoaslan.chapter1.excer15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sieve {
    private List<Boolean> isPrime;

    public Sieve(int n) {
        isPrime = new ArrayList<Boolean>();
        for(int i = 0; i <= n; ++i)
            isPrime.add(true);

        isPrime.set(0, false);
        isPrime.set(1, false);

        for(int i = 2 ; i <= n ; ++i)
            if (isPrime.get(i)== true)
                for(int j = i * i ; j <= n ; j += i)
                    isPrime.set(j, false);
    }

    public boolean getter(int index) {
        return isPrime.get(index);
    }
};

public class Excer15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Sieve sieve = new Sieve(n);

        for(int i = 2 ; i <= n ; ++i)
            if (sieve.getter(i))
                System.out.println(i);
        scanner.close();
    }

}