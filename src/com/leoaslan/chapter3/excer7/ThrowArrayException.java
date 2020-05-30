package com.leoaslan.chapter3.excer7;

class ArrayException extends Exception {
    ArrayException() {
        super("Yes, this is exception :)");
    }
}

public class ThrowArrayException {
    ThrowArrayException(int s) {
        try {
            check(s);
        } catch (ArrayException ex) {
            System.out.println(ex);
        }
    }

    void check(int s) throws ArrayException {
        if (s == 0)
            throw new ArrayException();
        System.out.println("Array size is: " + s);
    }

    public static void main(String[] args) {
        new ThrowArrayException(args.length);
    }
}
