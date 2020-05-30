package com.leoaslan.chapter3.excer5;

public class Excer5 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
        } catch (RuntimeException ex){
            System.out.println(ex);
        } finally {
            System.out.println("Truy cap phan tu ngoai gioi han mang");
        }
    }
}
