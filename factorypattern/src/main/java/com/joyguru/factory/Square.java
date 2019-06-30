package com.joyguru.factory;

public class Square implements Shape
{
    int length;

    public Square(int length) {
        this.length = length;
    }

    public double getArea() {
        return length*length;
    }

    public void draw() {

        System.out.println("Square");
    }
}
