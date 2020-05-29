package com.leoaslan.chapter2.excer3;

class Complex {
    private double real;

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {
    }

    public Complex add(Complex other) {
        Complex ans = new Complex();
        ans.setReal(real + other.getReal());
        ans.setImaginary(imaginary + other.getImaginary());
        return ans;
    }

    public Complex subtract(Complex other) {
        Complex ans = new Complex();
        ans.setReal(real - other.getReal());
        ans.setImaginary(imaginary - other.getImaginary());
        return ans;
    }

    public void print(){
        System.out.println(real + " " + imaginary + "i");
    }
}

public class UseComplex {
    public static void main(String[] args){
        Complex cmp1 = new Complex(5, 7);
        Complex cmp2 = new Complex(2, -10);

        Complex sum = cmp1.add(cmp2);
        Complex diff = cmp1.subtract(cmp2);

        sum.print();
        diff.print();
    }
}
