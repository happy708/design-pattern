package com.joyguru.factory;

public class Circle implements Shape
{
    int length;

    public Circle(int length) {
        this.length = length;
    }

    public double getArea() {
        return length*length*(22.0d/7);
    }

    public void draw() {

        System.out.println("Circle");
    }
}
