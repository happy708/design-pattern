package com.joyguru.factory;

public interface Shape
{
    enum Type
    {
        CIRCLE,
        SQUARE,
        TRIANGLE
    };

    double getArea();

    void draw();
}
