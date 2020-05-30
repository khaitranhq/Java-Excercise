package com.leoaslan.chapter3.excer4;

public class Excer4 {
    static String s;

    public static void main(String[] args) {
        try {
            System.out.println(" The length of string s is :" + s.length());
        } finally {
            System.out.println("Hello");
        }
    }
}
