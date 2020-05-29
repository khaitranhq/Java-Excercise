package com.leoaslan.chapter2.excer1;

import org.w3c.dom.css.Rect;

class Square {

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double width;

    Square(double width) {
        this.width = width;
    }

}

class Rectangle extends Square {
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    private double length;

    Rectangle(double width, double length) {
        super(width);
        this.length = length;
    }

}

public class Shapes {
    public static void main(String[] args) {
        Square s = new Square(50);
        System.out.println("s.width: " + s.getWidth());

        Rectangle rect = new Rectangle(55, 23);
        System.out.println("rect.width: " + rect.getWidth());
        System.out.println("rect.length" + rect.getLength());
    }
}
