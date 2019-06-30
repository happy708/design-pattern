package com.joyguru.factory;

public class Triangle implements Shape
{
    int length;

    public Triangle(int length) {
        this.length = length;
    }

    public double getArea() {
        return length*length*Math.sqrt(3)/4;
    }

    public void draw() {

        System.out.println("Triangle");
    }
}
