package com.leoaslan.chapter3.excer8;

public class WFormatException {
    WFormatException(int x){
        try {
            System.out.println(Math.sqrt(x));
        } catch(NumberFormatException ex){
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        try {
            new WFormatException(Integer.parseInt("0.5"));
        } catch (NumberFormatException ex){
            System.out.println(ex);
        }
    }
}
