package com.leoaslan.chapter2.excer6;

class Point {
    int _x;
    int _y;

    public Point(int x, int y) {
        _x = x;
        _y = y;
    }

    public String toString() {
        return "(" + _x + "," + _y + ")";
    }


}

abstract class Shape {
    private Point _origin;

    public Point getOrigin() {
        return _origin;
    }

    public Shape() {
        _origin = new Point(0, 0);
    }

    public Shape(int x, int y) {
        _origin = new Point(x, y);
    }

    public Shape(Point o) {
        _origin = o;
    }

    abstract public void draw();
}

public class Circle extends Shape {
    double radius;

    public Circle(double rad) {
        super();
        radius = rad;
    }

    public Circle(int x, int y, double rad) {
        super(x, y);
        radius = rad;
    }

    public Circle(Point o, double rad) {
        super(o);
        radius = rad;
    }

    public void draw() {
        System.out.println("Circle@" + getOrigin().toString() + ", rad = " + radius);
    }

    public static void main(String arg[]) {
        Circle circle = new Circle(1.0);
        circle.draw();
    }
}