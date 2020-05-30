package com.leoaslan.chapter3.excer9;

public class Excer9 {
    static void throwExeption() throws IllegalAccessError {
        throw new IllegalAccessError();
    }

    public static void main(String[] args) {
        try {
            throwExeption();
        } catch (IllegalAccessError ex){
            System.out.println(ex);
        }
    }
}
