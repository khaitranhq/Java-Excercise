package com.leoaslan.chapter2.excer2;

class Rectangle {
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calcArea(){
        return width * height;
    }
}

public class CreateObject {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(5, 2);
        System.out.println("rect width: " + rect.getWidth());
        System.out.println("rect height: " + rect.getHeight());
        System.out.println("Rect area: " + rect.calcArea());
    }
}
