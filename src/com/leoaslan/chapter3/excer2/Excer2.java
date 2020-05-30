package com.leoaslan.chapter3.excer2;

public class Excer2 {
    public static void main(String[] args) {
        try {
            // intentional error
            String s = "FOOBAR";
            int i = Integer.parseInt(s);

            // this line of code will never be reached
            System.out.println("int value = " + i);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }
}
